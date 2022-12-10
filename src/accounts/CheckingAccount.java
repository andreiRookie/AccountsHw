package accounts;

public class CheckingAccount extends Account {
    private static final long MIN_BALANCE = 0;

    public CheckingAccount(long accountBalance, String ownerName) {
        super(accountBalance, ownerName);
        this.accountType = AccountTypeEnum.CHECKING_ACCOUNT;
    }

    @Override
    public boolean pay(long amount) {
        if ((this.accountBalance - amount) >= MIN_BALANCE) {
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
}
