package accounts;

public class CreditAccount extends Account {

    public CreditAccount(String ownerName) {
        super(0, ownerName);
        this.accountType = AccountTypeEnum.CREDIT_ACCOUNT;
    }

    @Override
    public boolean add(long amount) {
        if ((this.accountBalance + amount) > 0) {
            return false;
        }
        return super.add(amount);
    }
}
