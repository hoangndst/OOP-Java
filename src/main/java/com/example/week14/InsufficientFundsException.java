package com.example.week14;

public class InsufficientFundsException extends BankException {

    /**
     * Constructor 1.
     */

    public InsufficientFundsException(String message) {
        super(message);
    }

    /**
     * Constructor 2.
     * @param amount the amount
     */

    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $" + String.format("%.2f", amount)
                + " để thực hiện giao dịch");
    }

}
