package OO_RemoteControl;

public class Remote {
    //Gedächtnisvariablen
    public boolean isOn;
    public boolean hasPower;
    private Battery firstBattery;
    private Battery secondBattery;

    public Remote(boolean isOn, boolean hasPower, Battery firstBattery, Battery secondBattery) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.firstBattery = firstBattery;
        this.secondBattery = secondBattery;
    }

    //Funktionen
    public void getStatus(){
        double result = 0;
        result = (firstBattery.getPower() + secondBattery.getPower()) / 2;
        System.out.println("The remote still has " + result +"% power left");
    }
    public void turnOn(){
        firstBattery.getPower() = firstBattery.getPower() - 5;

    }
    public void turnOff(){

    }

    //Getter

    public boolean isOn() {
        return isOn;
    }
    public boolean isHasPower() {
        return hasPower;
    }
    public Battery getFirstBattery() {
        return firstBattery;
    }
    public Battery getSecondBattery() {
        return secondBattery;
    }
}
