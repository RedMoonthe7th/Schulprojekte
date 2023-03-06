package OO_Calculator;

public class RootCalculator extends Calculator
{
    //braucht keine zusätzlichen GV

    //Konstruktor
    public RootCalculator(String name) {
        super(name);
    }

    //Funktionen
    public void root(double a)
    {
        double result = 0.0;
        result = Math.sqrt(a);
        System.out.println(result);
    }
}
