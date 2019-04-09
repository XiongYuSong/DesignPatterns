package hue.edu.xiong.proxy.dynamic_proxy_java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class DynamicProxy implements InvocationHandler {

    //被代理的类
    private Object object;

    // 将被代理者的实例传进动态代理类的构造函数中
    public DynamicProxy(Object object) {
        this.object = object;
    }

    /**
     * 覆盖InvocationHandler接口中的invoke()方法
     * 更重要的是，动态代理模式可以使得我们在不改变原来已有的代码结构
     * 的情况下，对原来的“真实方法”进行扩展、增强其功能，并且可以达到
     * 控制被代理对象的行为，下面的before、after就是我们可以进行特殊
     * 代码切入的扩展点了。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*
         * before ：doSomething();
         */
        System.out.println("开始时间："+new Date());

        Object result = method.invoke(this.object, args);

        System.out.println("结束时间："+new Date());
        /*
         * after : doSomething();
         */

        return result;
    }
}
