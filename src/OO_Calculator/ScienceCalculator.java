package OO_Calculator;


public class ScienceCalculator extends Calculator{
    //braucht keine zusätzlichen GV

    //Konstruktor
    public ScienceCalculator(String name)
    {
        super(name);
    }

    //Funktionen
    public void sinus(double a)
    {
        double result = 0.0;
        result = Math.sin(a);
        System.out.println(result + " RAD");
    }
    public void cosinus(double a)
    {
        double result = 0.0;
        result = Math.cos(a);
        System.out.println(result + " RAD");
    }
}
