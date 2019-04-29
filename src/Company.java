abstract public class Company implements Wallet{

    abstract public void addMoneyToWallet(double amount);
    abstract public void payMoneyToOthers(double amount);
    abstract public  double getCashBackAmount();
    abstract public double checkBalance();

}
