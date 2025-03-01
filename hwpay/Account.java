package hwpay;

public abstract class Account {
    protected long balance;

    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account account, long amount) {
        if (amount <= 0) {
            return false;
        }
        if (!pay(amount)) {
            return false;
        }
        if (!account.add(amount)) {
            add(amount);
            return false;
        }
        return true;
    }

    public long getBalance() {
        return balance;
    }

    public abstract boolean pay(long amount);

}

