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
    public void doCall( String number)
    {
        System.out.println("Calling " + number);
        System.out.println("Hello? Hello, hello? Welcome to your new summer job at...");
    }
    public void getInfo()
    {
        System.out.println("ID: " + getId());
        System.out.println("Phone Number: " + getPhonenumber());
    }

    // Getter
    public String getId() {
        return id;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
}
