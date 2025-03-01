package hwpay;

public class SimpleAccount extends Account {
    @Override
    public boolean pay(long amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
