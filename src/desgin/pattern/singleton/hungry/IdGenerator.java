package desgin.pattern.singleton.hungry;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  饿汉式单例
 *  初始化的时候创建实例
 *
 * @author drafthj
 * @date 2021/6/29
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IdGenerator {
    private AtomicInteger id = new AtomicInteger(0);
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {
    }

    public IdGenerator getInstance() {
        return instance;
    }

    public long getId(){
        return id.getAndIncrement();
    }
}
