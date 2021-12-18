package com.example.week14;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * Constructor 1.
     */

    public Customer() {
        
    }

    /**
     * Constructor 2.
     * @param idNumber the id number
     * @param fullName the full name
     */

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Get customer info.
     * @return the info
     */

    public String getCustomerInfo() {
        String info = "Số CMND: " + idNumber + ". ";
        info += "Họ tên: " + fullName + ".";
        return info;
    }

    /**
     * Add account.
     * @param account the account
     */

    public void addAccount(Account account) {
        for (Account a : accountList) {
            if (account.equals(a)) {
                return;
            }
        }
        accountList.add(account);
    }

    /**
     * Remove account.
     * @param account the account
     */

    public void removeAccount(Account account) {
        for (Account a : accountList) {
            if (account.equals(a)) {
                accountList.remove(a);
                break;
            }
        }
    }

    /**
     * Get id number.
     * @return the id number
     */

    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Set id number.
     * @param idNumber the id number
     */

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Get full name.
     * @return the full name
     */

    public String getFullName() {
        return fullName;
    }

    /**
     * Set full name.
     * @param fullName the full name
     */

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Get account list.
     * @return the account list
     */

    public List<Account> getAccountList() {
        return accountList;
    }
}
