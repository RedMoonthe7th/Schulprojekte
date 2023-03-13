package OO_Account;

public class SavingsAccount extends BaseAccount
{
    //Konstruktor
    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    //Funktionen
    @Override
    public double withdraw(double amount)
    {
        if ((getBalance() - amount)>=0)
        {
            System.out.println("Withdrew " + amount + "€");
            return super.withdraw(amount);
        }
        else{
            System.out.println("Not enough Money to withdraw");
            return 0;
        }
    }
}
