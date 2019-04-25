class Wallet implements User
{

    private  double moneyInWallet=0;

    public void addMoney(double amount)
    {
        moneyInWallet = moneyInWallet + amount;

    }

    public void payMoney(double amount)
    {
        if(moneyInWallet < amount  )
        {
            System.out.println("No sufficient balance in Wallet");

        }
        else
            moneyInWallet = moneyInWallet - amount;

    }

    public double checkBalance()
    {
        return moneyInWallet;

    }


}
