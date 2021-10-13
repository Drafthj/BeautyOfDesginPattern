package desgin.pattern.singleton.enumeration;

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
public enum IdGenerator {
    INSTANCE;
    private AtomicInteger id = new AtomicInteger(0);

    public long getId() {
        return id.getAndIncrement();
    }
}