import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {

        Client ivanPetrov = new Client("Иван П.", 3);
        Client katyaSidorova = new Client("Катя С.", 1);
        Client sergeyDolgov = new Client("Сергей Д.", 2);



        System.out.println(ivanPetrov.getName() + " открывает счет: " + (ivanPetrov.addAccount(new SavingsAccount(80_000, ivanPetrov.getName(), 50_000)) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(ivanPetrov.getName() + " открывает счет: " + (ivanPetrov.addAccount(new CheckingAccount(50_000, ivanPetrov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(ivanPetrov.getName() + " открывает счет: " + (ivanPetrov.addAccount(new CreditAccount(ivanPetrov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(ivanPetrov.getName() + " открывает счет: " + (ivanPetrov.addAccount(new CreditAccount(ivanPetrov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(ivanPetrov);
        System.out.println("ivanPetrov.accept(20000) -> " + ivanPetrov.accept(20000));
        System.out.println("ivanPetrov.getAccounts()[0].accept(10000) -> " + ivanPetrov.getAccounts()[0].accept(10000));
        System.out.println(ivanPetrov);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        System.out.println(katyaSidorova.getName() + " открывает счет: " + (katyaSidorova.addAccount(new CreditAccount(katyaSidorova.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(katyaSidorova.getName() + " открывает счет: " + (katyaSidorova.addAccount(new CheckingAccount(50_000, katyaSidorova.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(katyaSidorova);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        System.out.println(sergeyDolgov.getName() + " открывает счет: " + (sergeyDolgov.addAccount(new SavingsAccount(80_000, sergeyDolgov.getName(), 50_000)) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(sergeyDolgov.getName() + " открывает счет: " + (sergeyDolgov.addAccount(new CheckingAccount(50_000, sergeyDolgov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(sergeyDolgov);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        System.out.println("ivanPetrov.getAccounts()[0].transfer(katyaSidorova.getAccounts()[0], 14000) -> " + ivanPetrov.getAccounts()[0].transfer(katyaSidorova.getAccounts()[0], 14000));
        System.out.println("katyaSidorova.getAccounts()[0].transfer(sergeyDolgov.getAccounts()[0], 17000) -> " + katyaSidorova.getAccounts()[0].transfer(sergeyDolgov.getAccounts()[0], 17000));

        System.out.println(ivanPetrov);
        System.out.println(katyaSidorova);
        System.out.println(sergeyDolgov);

    }
}