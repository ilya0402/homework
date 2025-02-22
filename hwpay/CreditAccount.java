package hwpay;

public class CreditAccount extends Account {
   private long creditLimit;
    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && balance - amount >= -creditLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
