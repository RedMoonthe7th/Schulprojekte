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

    // Getter
    public String getId() {
        return id;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
}
