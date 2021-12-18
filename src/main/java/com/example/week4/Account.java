package com.example.week4;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction1> transitionList;   

    /**
     * Constructor 1.
     */

    Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<Transaction1>();
    }

    /**
     * Constructor 2.
     * @param balance the initial balance of the account.
     */

    Account(double balance) {
        this.balance = balance;
        this.transitionList = new ArrayList<Transaction1>();
    }

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
        transitionList.add(new Transaction1(Transaction1.DEPOSIT, amount, balance));
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction1(Transaction1.WITHDRAW, amount, balance));
        }
    }

    /**
     * Add transaction to the account.
     * @param amount the amount of the transaction.
     * @param operation the operation of the transaction.
     */

    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction1.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction1.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print the transitionList of the account.
     */

    public void printTransaction() {
        int i = 1;
        for (Transaction1 transaction : transitionList) {
            if (transaction.getOperation().equals(Transaction1.DEPOSIT)) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n", 
                i, transaction.getAmount(), transaction.getBalance());
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n", 
                i, transaction.getAmount(), transaction.getBalance());
            }
            i++;
        }
    }
}
