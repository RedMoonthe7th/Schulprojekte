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
        firstBattery.setConnected(true);
        firstBattery.setPower(firstBattery.getPower() - 5);
        System.out.println("First Battery: Verbraucher angeschlossen");
        secondBattery.setConnected(true);
        secondBattery.setPower(secondBattery.getPower() - 5);
        System.out.println("Second Battery: Verbraucher angeschlossen");
    }
    public void turnOff(){
        firstBattery.setConnected(false);
        System.out.println("First Battery: Kein Verbraucher angeschlossen");
        secondBattery.setConnected(false);
        System.out.println("Second Battery: Kein Verbraucher angeschlossen");
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
