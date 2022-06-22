package it.accentur.javaFoundamentals.bank;

public class Program
{
    public static void main(String[] args)
    {
        Account a1 = new AccountGold(1000);
        CaymanAccount c1 = new CaymanAccount (2000, "xyz");

        Account a2 = (Account) c1; //perchè un CaymanAccount extends Account (upcusting)
        // Account a3 = new String ("ciccio");
        //a3.deposit();
        //a2.deposit() va bene perchè CaymanAccount eredita tutto dalla classe madre
        Account a4 = new CaymanAccount(5, "o");
        //a4.evadiTax() // non è visto perchè il refererence a4 punta ad un Obj di tipo Account
        CaymanAccount c2 = (CaymanAccount) a4; // (downcasting) in modo ponderato e sensato va bene
        c2.evadiTaxes();
    }
}
