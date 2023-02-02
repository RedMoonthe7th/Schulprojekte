package OO_RemoteControl;


public class Battery {
    //Gedächtnisvariablen
    private int power;
    public enum TYPE {Renewable, Nonrenewable}
    private TYPE type;
    private boolean isConnected;

    //Konstruktor
    public Battery(int power, TYPE type, boolean isConnected) {
        this.power = power;
        this.type = type;
        this.isConnected = isConnected;
    }
    // Getter
    public int getPower() {
        return power;
    }
    public TYPE getType() {
        return type;
    }
    public boolean isConnected() {return isConnected;}

    //Setter
    public void setPower(int power) {
        this.power = power;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
    public void setConnected(boolean connected) {isConnected = connected;}
}
