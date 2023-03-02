package OO_Lamp;
import java.util.ArrayList;
import java.util.List;

public class Lamp {
    //Gedächtnisvariablen
    private String name;
    private List<glowElement> glowelements;

    //Konstruktor
    public Lamp(String name ) //List<glowElement> glowelements
    {
        this.name = name;
        this.glowelements = new ArrayList<>();
    }

    //Funktionen
    public void addLightElement( glowElement lightElement)
    {
        this.glowelements.add(lightElement);
    }
    public void turnAllOn()
    {
        for (glowElement e:this.glowelements)
        {
            e.turnOn();
        }
    }
    public double getOverallPowerUsage()
    {
        double overallPowerUsage = 0.0;
        for (glowElement e:this.glowelements)
        {
            overallPowerUsage += e.getConsumption();
        }
        return overallPowerUsage;
    }
    public void printNamesOfLightElements()
    {
        for (glowElement e:this.glowelements)
        {
            System.out.println(e.getName());
        }
    }

    //Getter und Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<glowElement> getGlowelements() {
        return glowelements;
    }
    public void setGlowelements(List<glowElement> glowelements) {
        this.glowelements = glowelements;
    }
}
