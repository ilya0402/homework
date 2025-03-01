package hwpay;

public class CreditAccount extends Account {
    private final long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance - amount < creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }
}
