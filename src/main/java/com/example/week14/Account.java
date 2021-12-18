package com.example.week14;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * Constructor 1.
     */

    public Account() {

    }

    /**
     * Constructor 2.
     * @param accountNumber the account number
     * @param balance the balance
     */

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Get account number.
     * @return the account number
     */

    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get balance.
     * @return the balance
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Do deposit.
     */

    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance += amount;
    }

    /**
     * Do withdraw.
     */

    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > this.balance) {
            throw new InsufficientFundsException(amount);
        }

        this.balance -= amount;
    }

    /**
     * Add transaction.
     * @param transaction the transaction
     */

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Get transaction list history.
     * @return the transaction list history
     */

    public String getTransactionHistory() {
        String history = "Lịch sử giao dịch của tài khoản " + this.accountNumber + ":";
        for (Transaction transaction : this.transactionList) {
            history += "\n- " + transaction.getTransactionSummary();
        }
        return history;
    }

    /**
     * Check equals.
     * @param obj the obj
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return this.accountNumber == account.accountNumber;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
