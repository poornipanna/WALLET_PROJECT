public class GooglePayWallet extends Company{

        private  double moneyInGooglePayWallet=0;

        public void addMoneyToWallet(double amount)
        {
            moneyInGooglePayWallet = moneyInGooglePayWallet + amount;
        }

        public void payMoneyToOthers(double amount)
        {
            if(moneyInGooglePayWallet < amount  )
            {
                System.out.println("No sufficient balance in Google Pay Wallet");

            }
            else
            {
                moneyInGooglePayWallet = moneyInGooglePayWallet - amount;
            }
        }

        public double checkBalance()
        {
            return moneyInGooglePayWallet;
        }

        public double getCashBackAmount()
        {
            double cashBackAmount=0;
            if(moneyInGooglePayWallet >= 500)
            {
                cashBackAmount = 20.00/100.00 * moneyInGooglePayWallet;
            }

            return cashBackAmount;
        }

}
