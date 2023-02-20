package at.xxx.examples.cars;

public class Engine {
    //Gedächtnisvariablen
    public enum TYPE {DIESEL, GAS}
    private TYPE type;
    private int power;

    //Constructor
    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;
    }
    //Methods

    //Getter and Setter
    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
}
