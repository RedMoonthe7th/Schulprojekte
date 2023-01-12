package OO_Car;

import java.lang.reflect.Type;

public class Engine {
    private int horsePower;
    public enum TYPE {DIESEL, GAS}
    private TYPE type;

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount) {
        System.out.println("the motor is running with " + amount);
    }

    // Getter
    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }
}
