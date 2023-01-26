package RemoteControl;


public class Battery {
    private int power;
    public enum TYPE {Renewable, Nonrenewable}
    private TYPE type;

    public Battery(int power, TYPE type) {
        this.power = power;
        this.type = type;
    }
}
