package OO_Account;

public class CreditAccount extends BaseAccount
{
    private int interestRate;
    //Konstruktor
    public CreditAccount(String owner, double balance, int interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }
    //Funktionen
    @Override
    public void deposit(double amount){
        if(0 >= this.getBalance() + amount)
        {
            System.out.println("Cleared " + amount + "€ from the credit");
            this.setBalance(getBalance() + amount);
        }
        else
        {
            System.out.println("Credit can't be positive");
        }

    }

    //Getter & Setter

    public int getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
