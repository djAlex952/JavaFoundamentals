package it.accentur.javaFoundamentals.bank;

public class AccountGold extends Account
{
    protected int fidelityPoints;

    public AccountGold (double balance, int fidPoints)
    {
        super(balance);
        this.fidelityPoints = fidPoints;
    }
    public AccountGold (double balance)
    {
        this(balance, 0);
    }
    public double convertFidelityPoints (){
        balance+= fidelityPoints;
        fidelityPoints = 0;
        return balance;
    }

    @Override
    public double deposit(double amount)
    {
        //super.deposit(amount);

        this.balance+=amount;
        fidelityPoints++;
        return balance;
    }
}
