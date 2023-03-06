package OO_Calculator;

public class Main
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator("C1");
        ScienceCalculator sc1 = new ScienceCalculator("SC1");
        RootCalculator rc1 = new RootCalculator("RC1");

        c1.addition(3,6);
        sc1.cosinus(180);
        sc1.addition(6.5,6.5);
        rc1.root(4);

    }
}
