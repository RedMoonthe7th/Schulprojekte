package OO_Figures;

public class Circle extends Figure
{
    private double radius;

    //Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    //Funktionen
    public void getArea()
    {
        double area = getRadius() * Math.PI;
        System.out.println("The area of the circle is " + area);
    }
    //Getter & Setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
