package OOP.oop_lab_2.problem3;

public class TestBankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount(101, 5.0);
        CheckingAccount checking = new CheckingAccount(102);

        bank.openAccount(savings);
        bank.openAccount(checking);

        savings.deposit(1000);
        checking.deposit(500);


        checking.withdraw(100);

        bank.printAccounts();

        savings.transfer(20, checking);

        checking.withdraw(100);


        bank.printAccounts();

        bank.updateAccounts();
        bank.printAccounts();

        bank.closeAccount(101);
        bank.printAccounts();
    }
}
