package desgin.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/8/12
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DynamicProxyHandler implements InvocationHandler {
    private IMetricController proxiedObject;

    public DynamicProxyHandler(IMetricController proxiedObject) {
        this.proxiedObject = proxiedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        method.invoke(proxiedObject);
        System.out.println(method.getName());
        return null;
    }

    public static void main(String[] args) {
        MetricController metricController = new MetricController();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(metricController);
        IMetricController m = (IMetricController) Proxy.newProxyInstance(MetricController.class.getClassLoader(), new Class[]{IMetricController.class}, dynamicProxyHandler);
        m.test();
    }
}
