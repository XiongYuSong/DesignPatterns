package hue.edu.xiong.proxy.dynamic_proxy_cglib;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class Star {

    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    public void doActivity() {
        System.out.println("欢迎" + this.name + "参加活动！");
    }

}
