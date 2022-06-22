package it.accentur.javaFoundamentals.bank;

public class CaymanAccount extends Account
{
    protected String secretCode;

    public CaymanAccount (double balance, String code)
    {
        super (balance);
        this.secretCode = code;
    }
    @Override
    public double deposit (double amount)
    {
        balance += amount*1.1;
        return balance;
    }
    public void evadiTaxes ()
    {
        balance = balance*1.05;
    }
}
