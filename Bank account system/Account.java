package OOP.oop_lab_2.problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
            balance = Math.round(balance * 100.0) / 100.0;
        } else {
            System.out.println("Cannot deposit negative amounts into account " + accNumber);
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
            balance = Math.round(balance * 100.0) / 100.0;
        } else {
            System.out.println("Invalid withdraw amount from account " + accNumber);
        }
    }

    public double getBalance() {
        return Math.round(balance * 100.0) / 100.0;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("Transferred $" + amount + " from account " + this.accNumber + " to account " + other.getAccountNumber());
        } else {
            System.out.println("Transfer failed from account " + this.accNumber + " to account " + other.getAccountNumber());
        }
    }

    @Override
    public String toString() {
        return "Account " + accNumber + ": Balance = $" + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}
