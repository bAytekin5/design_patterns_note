package loosecoupling;

public class RemoteController {

    private RemoteControllerInterface remote;

    public RemoteController(RemoteControllerInterface remote) {
        this.remote = remote;
    }

    public void on() {
        remote.on();
    }

    public void off() {
        remote.off();
    }
}
