package accounts;

public class Account {

    protected long accountBalance;
    protected String ownerName;
    protected AccountTypeEnum accountType;

    protected Account(long accountBalance, String ownerName) {
        this.accountBalance = accountBalance;
        this.ownerName = ownerName;
    }

    public boolean pay(long amount) {
        this.accountBalance -= amount;
        return true;
    }

    public boolean add(long amount) {
        this.accountBalance += amount;
        return true;
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
