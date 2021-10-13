package desgin.pattern.singleton.staticInner;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  静态内部类单例
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/6/29
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IdGenerator {
    private IdGenerator(){}
    private static final AtomicInteger id = new AtomicInteger(0);

    private static class SingletonHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance(){
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.getAndIncrement();
    }

}
