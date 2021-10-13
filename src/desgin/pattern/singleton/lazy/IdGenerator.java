package desgin.pattern.singleton.lazy;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  懒汉式单例
 *  需要的时候才会创建实例
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
            instance = new IdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.getAndIncrement();
    }
}
