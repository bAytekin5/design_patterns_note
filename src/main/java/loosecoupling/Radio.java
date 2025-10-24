package loosecoupling;

public class Radio implements RemoteControllerInterface {
    @Override
    public void on() {
        System.out.println("Radio turned ON");
    }

    @Override
    public void off() {
        System.out.println("Radio OFF");
    }
}
