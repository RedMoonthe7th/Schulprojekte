package OO_Handy;

public class SIMCard
{
    //Variables
    private String id;
    private int phonenumber;

    //Constuctor
    public SIMCard(String id, int phonenumber) {
        this.id = id;
        this.phonenumber = phonenumber;
    }

    //Functions
    public void doCall()
    {
        System.out.println("Hello? Hello? Welcome to your new summer job at...");
    }
    public void replaceSim(String replacementID, int replacementNumber)
    {
        setId(replacementID);
        setPhonenumber(replacementNumber);
        System.out.println("Successfully replaced the sim-card");
    }
    // Getter & Setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
