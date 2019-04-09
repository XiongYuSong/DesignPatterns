package hue.edu.xiong.proxy.static_proxy;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class StarProxy implements IStar {
    //代理对象
    private IStar star;

    public StarProxy(IStar star) {
        this.star = star;
    }

    @Override
    public void doActivity() {
        System.out.println("Java静态实现代理：活动前洽谈！");
        star.doActivity();
        System.out.println("Java静态实现代理：活动后结算！");
    }
}
