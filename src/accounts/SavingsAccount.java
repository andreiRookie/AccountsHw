package accounts;

public class SavingsAccount extends Account {
    private long minBalance;

    public SavingsAccount(long accountBalance, String ownerName, long minimumAccountBalance) {
        super(accountBalance, ownerName);
        this.minBalance = minimumAccountBalance;
        this.accountType = AccountTypeEnum.SAVINGS_ACCOUNT;
    }

    @Override
    public boolean pay(long amount) {
        if ((this.accountBalance - amount) >= this.minBalance) {
            this.accountBalance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean add(long amount) {
        this.accountBalance += amount;
        return true;
    }

    public long getMinBalance() {
        return this.minBalance;
    }

    public void setMinBalance(long minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public String toString() {
         return super.toString() + " Мин. баланс: " + this.minBalance;
    }
}
