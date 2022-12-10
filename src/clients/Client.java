package clients;

import accounts.*;
import java.util.Arrays;

public class Client implements MoneyTarget {

    protected String name;
    protected Account[] accounts;

    public Client(String name, int maxAccountsCount) {
        this.name = name;
        this.accounts = new Account[maxAccountsCount];
    }

    public boolean addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(long money) {
        for (Account account : accounts) {

            if (account == null) {
                break;
            }

            if (account.accept(money)) return true;
        }
        return false;
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {

            if (accounts[i] == null) {
                break;
            }

            if (accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Счета клиента " + name + ":\n" + Arrays.toString(accounts);
    }

    public String getName() {
        return name;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}
