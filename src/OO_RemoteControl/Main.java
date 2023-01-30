package OO_RemoteControl;

public class Main {
    public static void main(String[] args) {

        Battery b1 = new Battery(94, Battery.TYPE.Renewable);
        Battery b2 = new Battery(59, Battery.TYPE.Renewable);

        Remote r1 = new Remote(false,true, b1, b2);

        r1.getStatus();
    }
}
