package hue.edu.xiong.facade;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/13
 */
public class SubSystem {

    public void turnOnTV() {
        System.out.println("打开TV中。。。");
    }

    public void turnOnDVD() {
        System.out.println("打开DVD中。。。");
    }

    public void setCD(String cd) {
        System.out.println("设置CD（" + cd + "）");
    }

    public void turnOnAirConditioning() {
        System.out.println("打开空调中。。。");
    }

    public void starWatching() {
        System.out.println("正在放映。。。");
    }
}
