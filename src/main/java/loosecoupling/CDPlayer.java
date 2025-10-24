package loosecoupling;

public class CDPlayer implements RemoteControllerInterface {
    @Override
    public void on() {
        System.out.println("CD Player turned ON");
    }

    @Override
    public void off() {
        System.out.println("CD Player OFF");
    }
}
