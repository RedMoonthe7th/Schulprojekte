package OO_RemoteControl;


public class Battery {
    //Gedächtnisvariablen
    private int power;
    public enum TYPE {Renewable, Nonrenewable}
    private TYPE type;

    //Konstruktor
    public Battery(int power, TYPE type) {
        this.power = power;
        this.type = type;
    }
    // Getter
    public int getPower() {
        return power;
    }
    public TYPE getType() {
        return type;
    }
    //Setter
    public void setPower(int power) {
        this.power = power;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
}
