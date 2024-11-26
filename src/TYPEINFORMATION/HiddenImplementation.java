package TYPEINFORMATION;

import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        // 获取目标方法
        Method method = a.getClass().getDeclaredMethod(methodName);

        // 设置方法可访问
        method.setAccessible(true);

        // 调用方法
        method.invoke(a);
    }
}
