package hue.edu.xiong.proxy.dynamic_proxy_cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 *
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class DynamicProxy implements MethodInterceptor {
    //维护目标对象
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance() {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(object.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //执行目标对象的方法
        System.out.println("Cglib实现代理：开始时间："+new Date());

        Object result = method.invoke(this.object, args);

        System.out.println("Cglib实现代理：结束时间："+new Date());

        return result;
    }
}
