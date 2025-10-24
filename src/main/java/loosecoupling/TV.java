package loosecoupling;

public class TV implements RemoteControllerInterface {
    @Override
    public void on() {
        System.out.println("TV turned on");
    }

    @Override
    public void off() {
        System.out.println("TV OFF");
    }
}
