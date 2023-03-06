package OO_Calculator;

public class Calculator {
    //Gedächtnisvariablen
    private String name;

    //Konstruktor
    public Calculator(String name) {
        this.name = name;
    }

    //Funktionen
    public void addition( double a, double b)
    {
        double result = 0.0;
        result = a + b;
        System.out.println(result);
    }
    public void subtraction( double a, double b)
    {
        double result = 0.0;
        result = a - b;
        System.out.println(result);
    }
    public void multiplication( double a, double b)
    {
        double result = 0.0;
        result = a * b;
        System.out.println(result);
    }
    public void division( double a, double b)
    {
        double result = 0.0;
        result = a / b;
        System.out.println(result);
    }

    //Getter und Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
