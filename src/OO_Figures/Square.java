package OO_Figures;

public class Square extends Figure
{
    private double length;

    //Constructor
    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    //Funktionen
    public void getArea()
    {
        double area = getLength() * getLength();
        System.out.println("The area of the circle is " + area);
    }
    //Getter & Setter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

}
