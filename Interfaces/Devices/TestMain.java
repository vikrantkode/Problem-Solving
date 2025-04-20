package Interfaces.Devices;

public class TestMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.clickPicture();
        smartPhone.deletePicture();
        smartPhone.playMusic();
        smartPhone.pauseMusic();
        smartPhone.playMusic();
        smartPhone.connectCall(989898980);
        smartPhone.disconnectCall();
    }
}
