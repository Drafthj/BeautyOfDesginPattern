package desgin.pattern.singleton.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/29
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IdGenerator {
    private static final ConcurrentHashMap<Long, IdGenerator> instanceMap = new ConcurrentHashMap<>();
    private AtomicInteger id = new AtomicInteger(0);

    public static IdGenerator getInstance() {
       Long currentThreadId = Thread.currentThread().getId();
       instanceMap.putIfAbsent(currentThreadId, new IdGenerator());
       return instanceMap.get(currentThreadId);
    }

    public long getId() {
        return id.getAndIncrement();
    }

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-A" + IdGenerator.getInstance().getId());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-B" + IdGenerator.getInstance().getId());
            }
        }).start();
    }
}
