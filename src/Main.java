public class Main {

    public static void main(String[] args)
    {
        User user1 = new Wallet();
        user1.addMoney(800);
        user1.payMoney(50);
        user1.addMoney(800);
        user1.checkBalance();
        user1.payMoney(500);
        user1.payMoney(50);
        user1.payMoney(800);
        user1.payMoney(150);


        double balance = user1.checkBalance();

        System.out.println("Balance in the wallet for User1:" +balance);


        User user2 = new Wallet();
        user2.addMoney(200);
        user2.payMoney(50);
        user2.addMoney(800);
        user2.checkBalance();
        user2.payMoney(500);
        user2.payMoney(50);
        user2.payMoney(800);
        user2.payMoney(150);


        System.out.println("Balance in the wallet for User2:" +user2.checkBalance());


    }
}
