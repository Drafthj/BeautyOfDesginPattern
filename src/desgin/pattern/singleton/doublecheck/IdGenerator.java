package desgin.pattern.singleton.doublecheck;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  双重检测单例
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/29
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IdGenerator {
    private static IdGenerator instance = null;
    private static final AtomicInteger id = new AtomicInteger(0);
    private IdGenerator() {}
    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.getAndIncrement();
    }
}
