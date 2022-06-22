package it.accentur.javaFoundamentals.bank;

public abstract class Account
{
    protected double balance;


    public Account (double bal)
    {
        this.balance = bal;
    }
    public abstract double deposit (double amount);
    public double withdraw (double amount)
    {
        balance -= amount;
        return balance;
    }
    public double transfer (double amount, Account other)
    {
        other.deposit(amount);
        this.withdraw(amount);
        return this.balance;
    }
}
