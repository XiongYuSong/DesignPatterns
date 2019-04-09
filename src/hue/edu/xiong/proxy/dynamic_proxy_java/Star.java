package hue.edu.xiong.proxy.dynamic_proxy_java;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/9
 */
public class Star implements IStar {

    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void doActivity() {
        System.out.println("欢迎" + this.name + "参加活动！");
    }

    public void aaa(){
        System.out.println("aaaaaaaaaaa");
    }
}
