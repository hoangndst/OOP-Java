package com.example.week14;

public class InvalidFundingAmountException extends BankException {

    /**
     * Constructor 1.
     * @param message the message
     */

    public InvalidFundingAmountException(String message) {
        super(message);
    }

    /**
     * Constructor 2.
     * @param amount the amount
     */

    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
    
}
