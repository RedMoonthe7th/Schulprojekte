package OO_Account;

public class Main
{
    public static void main(String[] args)
    {
        SavingsAccount sa1 = new SavingsAccount("Hannes", 500.00);
        CheckingsAccount ca1 = new CheckingsAccount("Finn", 350.00, 200.00);
        CreditAccount cra1 = new CreditAccount("Leonie", -350, 2);

        sa1.withdraw(500);
        ca1.withdraw(560);
        cra1.deposit(20);
        System.out.println(cra1.getOwner());
    }
}
