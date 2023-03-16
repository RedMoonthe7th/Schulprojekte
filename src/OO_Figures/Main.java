package OO_Figures;

public class Main
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle("Circle1",5.5);
        Rectangle r1 = new Rectangle("Rectangle1", 10, 12.5);
        Square s1 = new Square("Square1", 7.5);

        c1.getArea();
        r1.getArea();
        s1.getArea();
    }

}
