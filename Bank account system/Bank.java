package OOP.oop_lab_2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Opened Account: " + account.getAccountNumber());
    }

    public void closeAccount(int accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNumber) {
                accounts.remove(acc);
                break;
            }
        }
        System.out.println("Closed Account: " + accNumber);
    }

    public void updateAccounts() {
        System.out.println("--- Updating Accounts ---");
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAccounts() {
        System.out.println("--- Printing Account Details ---");
        for (Account acc : accounts) {
            acc.print();
        }
    }
}
