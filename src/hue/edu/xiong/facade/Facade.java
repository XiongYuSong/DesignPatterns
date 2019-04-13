package hue.edu.xiong.facade;

/**
 * @Author Xiong YuSong
 * @Date 2019/4/13
 */
public class Facade {
    private SubSystem subSystem;

    public Facade() {
        this.subSystem =new SubSystem();
    }

    public void watchMovie(String cd){
        subSystem.turnOnTV();
        subSystem.turnOnDVD();
        subSystem.setCD(cd);
        subSystem.turnOnAirConditioning();
        subSystem.starWatching();
    }
}
