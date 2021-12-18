package com.example.week14;

public class SavingsAccount extends Account {

    /**
     * Constructor.
     * @param accountNumber the account number
     * @param balance the balance
     */

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Deposit.
     */

    @Override
    public void deposit(double amount) {
        try {
            super.doDepositing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, getBalance() - amount, getBalance());
            addTransaction(transaction);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Withdraw.
     */

    @Override
    public void withdraw(double amount) {
        try {
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (this.getBalance() < 5000) {
                throw new InsufficientFundsException(amount);
            }
            super.doWithdrawing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                    amount, getBalance() + amount, getBalance());
            addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

}
