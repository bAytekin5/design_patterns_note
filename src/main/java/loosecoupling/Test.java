package loosecoupling;

public class Test {

    public static void main(String[] args) {

        RemoteControllerInterface r1 = new CDPlayer();
        RemoteControllerInterface r2 = new TV();

//        RemoteController remote = new RemoteController(r1);
        RemoteController remote = new RemoteController(r2);

        remote.on();
        remote.off();
    }
}
