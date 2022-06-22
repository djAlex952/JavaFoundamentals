package it.accentur.javaFoundamentals.bank;

public class ProgrammersAccount extends Account
{

    public ProgrammersAccount (double bal){
        super(bal);
    }
    @Override
    public double deposit(double amount) {
        this.balance+=0.9*amount;
        return balance;
    }
}
