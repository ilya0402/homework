package hwpay;

public class Main {
public static void main(String[] args) {

    SimpleAccount simpleAccount = new SimpleAccount();
    simpleAccount.add(500);
    System.out.println("SimpleAccount balance: " + simpleAccount.getBalance());
    simpleAccount.pay(150);
    System.out.println("SimpleAccount balance after pay: " + simpleAccount.getBalance());

    CreditAccount creditAccount = new CreditAccount(3000);
    creditAccount.add(800);
    System.out.println("CreditAccount balance: " + creditAccount.getBalance());
    creditAccount.pay(1050);
    System.out.println("CreditAccount balance after pay: " + creditAccount.getBalance());

    boolean transferSuccess = simpleAccount.transfer(creditAccount, 350);
    System.out.println("SimpleAccount balance after transfer: " + simpleAccount.getBalance());
    System.out.println("CreditAccount balance after transfer: " + creditAccount.getBalance());
}
}


