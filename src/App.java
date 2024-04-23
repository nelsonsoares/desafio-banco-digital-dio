import account.Account;
import account.AccountType;
import client.Client;
import client.TypeClient;

public class App {
    public static void main(String[] args) {
        var clint1 = new Account(new Client("João Carlos", TypeClient.CPF), 1, AccountType.CURRENT, 1500.0);
        var clint2 = new Account(new Client("Maria Fernanda", TypeClient.CNPJ), 1, AccountType.SAVINGS, 1200.0);

        clint1.transfer(clint2, 500.0);
        clint2.transfer(clint1, 200.0);

        clint1.withdraw(200.0); //Saque
        clint2.withdraw(300.0); //Saque

        clint1.deposit(500.0);
        clint2.deposit(800.0);

        clint1.printExtract();
        clint2.printExtract();
    }
}
