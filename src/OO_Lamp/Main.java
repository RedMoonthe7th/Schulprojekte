package OO_Lamp;

public class Main {
    public static void main(String[] args)
    {
        glowElement ge1 = new glowElement("gE1","Red", 10, false);
        glowElement ge2 = new glowElement("gE2", "Blue", 5, false);

        Lamp l1 = new Lamp("L1");

        l1.addLightElement(ge1);
        l1.printNamesOfLightElements();
        l1.addLightElement(ge2);
        System.out.println(l1.getOverallPowerUsage());
    }
}
