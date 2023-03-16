package OO_Figures;

public class Rectangle extends Figure
{
    private double length;
    private double width;

    //Constructor
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    //Funktionen
    public void getArea()
    {
        double area = getLength() * getWidth();
        System.out.println("The area of the circle is " + area);
    }
    //Getter & Setter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
