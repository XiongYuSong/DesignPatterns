package hue.edu.xiong.proxy.dynamic_proxy_java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class Client {

    //每个方法开始和结束时间
    public static void main(String[] args) {

        IStar star = new Star("Xiong JavaProxy");
        InvocationHandler handler = new DynamicProxy(star);
        IStar star1 = (IStar) Proxy.newProxyInstance(handler.getClass().getClassLoader(), star.getClass().getInterfaces(), handler);
        star1.doActivity();

        IPeople people = new People();
        InvocationHandler handler1 = new DynamicProxy(people);
        IPeople people1 = (IPeople) Proxy.newProxyInstance(handler1.getClass().getClassLoader(),people.getClass().getInterfaces(),handler1);
        people1.say();


    }
}
