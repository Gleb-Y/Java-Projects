package OOP.oop_lab_2.problem3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        System.out.println("Deposited $" + sum + " into Account " + this.getAccountNumber());

        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
        System.out.println("Withdrew $" + sum + " from Account " + this.getAccountNumber());

        deductFee();
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            if (this.getBalance() >= TRANSACTION_FEE) {
                super.withdraw(TRANSACTION_FEE);
                System.out.println("Fee of $" + TRANSACTION_FEE + " deducted from Account " + getAccountNumber());
            } else {
                System.out.println("Insufficient balance in Account " + getAccountNumber() + " to cover transaction fees.");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Transactions: " + transactionCount;
    }
}
