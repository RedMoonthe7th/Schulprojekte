package OO_Account;

public class BaseAccount
{
    //Gedächtnisvariablen
    private String owner;
    private double balance;

    // Konstruktor
    public BaseAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //Funktionen
    public void deposit(double amount){
        this.balance += amount;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }

    //Getter & Setter
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
