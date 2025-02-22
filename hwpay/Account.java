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
        if (pay(amount)) {
            return account.add(amount);
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }

    public abstract boolean pay(long amount);

}

