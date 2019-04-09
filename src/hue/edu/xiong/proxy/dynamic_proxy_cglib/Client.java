package hue.edu.xiong.proxy.dynamic_proxy_cglib;


/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class Client {

    //每个方法开始和结束时间
    public static void main(String[] args) {

        Star star = new Star("Xiong Cglib");

        Star star1 = (Star) new DynamicProxy(star).getProxyInstance();

        star1.doActivity();
    }
}
