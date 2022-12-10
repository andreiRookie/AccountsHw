package accounts;

public abstract class Account implements MoneyTarget {

    protected long accountBalance;
    protected String ownerName;
    protected AccountTypeEnum accountType;

    protected Account(long accountBalance, String ownerName) {
        this.accountBalance = accountBalance;
        this.ownerName = ownerName;
    }

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);

    @Override
    public boolean accept(long money) {
        return this.add(money);
    }

    public boolean transfer(Account accountTo, long amount) {
        if (this.pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                this.add(amount);
                return false;
            }
        }
        return false;
    }

    public long getAccountBalance() {
        return this.accountBalance;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getAccountType() {
        return accountType.toString();
    }

    @Override
    public String toString() {
        return "Счёт: " + accountType + " - Владелец: " + this.ownerName + "; баланс: " + accountBalance;
    }
}
