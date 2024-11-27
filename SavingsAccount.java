package OOP.oop_lab_2.problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest of $" + interest + " added to account " + getAccountNumber());
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        System.out.println("Deposited $" + sum + " into account " + this.getAccountNumber());

    }

    @Override
    public void withdraw(double sum) {
        super.deposit(sum);
        System.out.println("Withdrew $" + sum + " from account " + this.getAccountNumber());

    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}
