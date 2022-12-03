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
        System.out.println("-----------------------------------------------");
        System.out.println(ivanPetrov.getName() + " платит 40000rub. " + (ivanPetrov.pay(40000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса)"));
        System.out.println(ivanPetrov.getName() + " платит 50000rub. " + (ivanPetrov.pay(50000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса)"));
        System.out.println(ivanPetrov.getName() + " платит 60000rub. " + (ivanPetrov.pay(60000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса)"));
        System.out.println(ivanPetrov.getName() + "  пополняет счет " + ivanPetrov.getAccounts()[1].getAccountType()+ " на 30000rub.: " + (ivanPetrov.getAccounts()[1].add(30000) ? "пополнение успешно":"ошибка пополнения счёта"));
        System.out.println(ivanPetrov.getName() + "  пополняет счет " + ivanPetrov.getAccounts()[2].getAccountType()+ " на 70000rub.: " + (ivanPetrov.getAccounts()[2].add(70000) ? "пополнение успешно":"ошибка пополнения счёта"));
        System.out.println(ivanPetrov);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        System.out.println(katyaSidorova.getName() + " открывает счет: " + (katyaSidorova.addAccount(new SavingsAccount(80_000, katyaSidorova.getName(), 50_000)) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(katyaSidorova.getName() + " открывает счет: " + (katyaSidorova.addAccount(new CheckingAccount(50_000, katyaSidorova.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(katyaSidorova.getName() + " открывает счет: " + (katyaSidorova.addAccount(new CreditAccount(katyaSidorova.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(katyaSidorova);
        System.out.println("-----------------------------------------------");
        System.out.println(katyaSidorova.getName() + " платит 60000rub. " + (katyaSidorova.pay(60000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса"));
        System.out.println(katyaSidorova.getName() + "  пополняет счет " + katyaSidorova.getAccounts()[0].getAccountType()+ " на 45000rub.: " + (katyaSidorova.getAccounts()[0].add(45000) ? "пополнение успешно":"ошибка пополнения счёта"));
        System.out.println(katyaSidorova);
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        System.out.println(sergeyDolgov.getName() + " открывает счет: " + (sergeyDolgov.addAccount(new SavingsAccount(80_000, sergeyDolgov.getName(), 50_000)) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(sergeyDolgov.getName() + " открывает счет: " + (sergeyDolgov.addAccount(new CheckingAccount(50_000, sergeyDolgov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(sergeyDolgov.getName() + " открывает счет: " + (sergeyDolgov.addAccount(new CreditAccount(sergeyDolgov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(sergeyDolgov.getName() + " открывает счет: " + (sergeyDolgov.addAccount(new CreditAccount(sergeyDolgov.getName())) ? "Счёт открыт" : "Превышено кол-во счетов"));
        System.out.println(sergeyDolgov);
        System.out.println("-----------------------------------------------");
        System.out.println(sergeyDolgov.getName() + " платит 40000rub. " + (sergeyDolgov.pay(40000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса)"));
        System.out.println(sergeyDolgov.getName() + " платит 50000rub. " + (sergeyDolgov.pay(50000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса)"));
        System.out.println(sergeyDolgov.getName() + " платит 60000rub. " + (sergeyDolgov.pay(60000) ? "платеж исполнен" : "платеж неисполнен(ограничение мин. баланса)"));
        System.out.println(sergeyDolgov.getName() + "  пополняет счет " + sergeyDolgov.getAccounts()[0].getAccountType()+ " на 40000rub.: " + (sergeyDolgov.getAccounts()[0].add(40000) ? "пополнение успешно":"ошибка пополнения счёта"));
        System.out.println(sergeyDolgov.getName() + "  пополняет счет " + sergeyDolgov.getAccounts()[1].getAccountType()+ " на 50000rub.: " + (sergeyDolgov.getAccounts()[1].add(50000) ? "пополнение успешно":"ошибка пополнения счёта"));
        System.out.println(sergeyDolgov);
        System.out.println("-----------------------------------------------");

    }
}