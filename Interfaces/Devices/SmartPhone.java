package Interfaces.Devices;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void clickPicture() {
        System.out.println("Taking a picture from SmartPhone");
    }

    @Override
    public void deletePicture() {
        System.out.println("Deleting a picture from SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music from SmartPhone");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause Music from SmartPhone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music from SmartPhone");
    }

    @Override
    public void connectCall(Integer number) {
        System.out.println("Calling a number: " + number + " from SmartPhone");
    }

    @Override
    public void disconnectCall() {
        System.out.println("Disconnecting a call  from SmartPhone");
    }
    //effectively achieved multiple inheritance
}
