public class Main {

    public static void main(String[] args)
    {

        Wallet amazonWallet= new AmazonWallet();
        amazonWallet.addMoneyToWallet(2000);
        amazonWallet.payMoneyToOthers(500);
        amazonWallet.payMoneyToOthers(200);
        double amazonBalance = amazonWallet.checkBalance();
        double getAmazonCashBack = amazonWallet.getCashBackAmount();

        System.out.println("Balance in Amazon Wallet:" +amazonBalance);
        System.out.println("Cash Back from Amazon " +getAmazonCashBack);


        System.out.println("-----------------------------------------------------");
        Wallet googleWallet = new GooglePayWallet();
        googleWallet.addMoneyToWallet(1000);
        googleWallet.payMoneyToOthers(500);
        double googleBalance = googleWallet.checkBalance();
        double getGoogleCashBack = googleWallet.getCashBackAmount();

        System.out.println("Balance in GooglePay:" +googleBalance);
        System.out.println("Cash back from Google :" +getGoogleCashBack);

    }
}
