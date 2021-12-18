package com.example.week4;

public class Transaction1 {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Constructor.
     * @param operation The operation performed.
     * @param amount The amount of the operation.
     * @param balance The balance after the operation.
     */

    public Transaction1(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Getter for the operation.
     * @return The operation.
     */

    public String getOperation() {
        return operation;
    }

    /**
     * Setter for the operation.
     * @param operation The operation.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Getter for the amount.
     * @return The amount.
     */

    public double getAmount() {
        return amount;
    }

    /**
     * Setter for the amount.
     * @param amount The amount.
     */

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Getter for the balance.
     * @return The balance.
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Setter for the balance.
     * @param balance The balance.
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
