package OO_Account;

public class CheckingsAccount extends BaseAccount
{
    //Gedächtnisvariablen
    private double limit;

    //Konstruktor
    public CheckingsAccount(String owner, double balance, double limit) {
        super(owner, balance);
        this.limit = limit;
    }

    //Funktionen
    @Override
    public double withdraw(double amount)
    {
        if ((getBalance() - amount) >= (limit * -1))
        {
            System.out.println("Withdrew " + amount + "€");
            return super.withdraw(amount);
        }
        else{
            System.out.println("The limit of " + limit + "€ cannot be overstepped");
            return 0;
        }
    }
    //Getter & Setter
    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
}
