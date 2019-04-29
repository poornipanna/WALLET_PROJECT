 class AmazonWallet extends Company {


    private  double moneyInAmazonWallet=0;

    public void addMoneyToWallet(double amount)
    {
        moneyInAmazonWallet = moneyInAmazonWallet + amount;
    }

    public void payMoneyToOthers(double amount)
    {
        if(moneyInAmazonWallet < amount  )
        {
            System.out.println("No sufficient balance in Amazon Wallet");

        }
        else
        {
            moneyInAmazonWallet = moneyInAmazonWallet - amount;
        }
    }

     public double checkBalance()
     {
         return moneyInAmazonWallet;
     }

    public double getCashBackAmount()
    {
        double cashBackAmount=0;
        if(moneyInAmazonWallet >= 1000)
        {
            cashBackAmount = 20.00/100.00 * moneyInAmazonWallet;
        }

        return cashBackAmount;
    }

}
