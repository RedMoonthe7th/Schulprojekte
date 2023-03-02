package OO_Lamp;

public class glowElement {
    //Gedächtnisvariablen
    private String name;
    private String color;
    private int consumption;
    private boolean status = false;

    //Konstrukter
    public glowElement(String name, String color, int consumption, boolean status) {
        this.name = name;
        this.color = color;
        this.consumption = consumption;
        this.status = status;
    }

    // Funktionen
    public void turnOn()
    {
        if(this.status = false)
        {
            this.setStatus(true);
            this.consumption = this.consumption + 5;
        }
        else
        {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschaltet");
        }
    }

    //Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
