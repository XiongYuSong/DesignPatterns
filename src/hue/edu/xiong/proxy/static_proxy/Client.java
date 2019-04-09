package hue.edu.xiong.proxy.static_proxy;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class Client {
    public static void main(String[] args) {
        IStar star = new StarProxy(new Star("XiongGe"));
        star.doActivity();
    }
}
