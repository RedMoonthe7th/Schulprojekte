package at.xxx.examples.cars;

public class Main {
    public static void main(String[] args){
        Seller s1 = new Seller("Franz","German",15);
        Engine en1 = new Engine(Engine.TYPE.GAS,100);
        Car c1 = new Car(en1,s1,180,10, 100);

        c1.price();
    }
}
