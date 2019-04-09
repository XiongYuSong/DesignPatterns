package hue.edu.xiong.proxy.dynamic_proxy_java;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class People implements IPeople {
    @Override
    public void say() {
        System.out.println("Peopel Say:");
    }
}
