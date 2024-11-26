package TYPEINFORMATION;

import java.lang.reflect.*;

// 动态代理处理器类,实现了 InvocationHandler 接口
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied; // 被代理的对象

    // 构造函数,接收被代理的对象
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    // 实现 invoke 方法,处理代理对象的方法调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 打印代理对象的类、被调用的方法以及参数
        System.out.println("****proxy: " + proxy.getClass() + ", method: " + method + ", args: ");
        if (args != null) {
            // 如果有参数,逐一打印
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        // 调用被代理对象的方法并返回结果
        return method.invoke(proxied, args);
    }
}

// 主类,演示动态代理的使用
public class SimpleDynamicProxy {
    // 消费者方法,接收接口类型的对象并调用其方法
    public static void consumer(Interface iface) {
        iface.dosomething(); // 调用 dosomething 方法
        iface.somethingelse("bonobo"); // 调用 somethingelse 方法并传入参数
    }

    public static void main(String[] args) {
        // 创建真实对象
        RealObject real = new RealObject();
        // 调用消费者方法,直接使用真实对象
        consumer(real);

        // 创建代理对象
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(), // 类加载器
                new Class[]{Interface.class}, // 代理的接口
                new DynamicProxyHandler(real) // 代理处理器
        );

        // 调用消费者方法,使用代理对象
        consumer(proxy);
    }
}

