package com.example.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
    
    private List<Customer> customerList = new ArrayList<>();

    /**
     * Read customer list.
     */

    public void readCustomerList(InputStream inputStream) {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                if (!line.contains(Account.CHECKING) && !line.contains(Account.SAVINGS)) {
                    int index = line.lastIndexOf(" ");
                    long idNumber = Long.parseLong(line.substring(index + 1, line.length()));
                    Customer customer = new Customer(idNumber, line.substring(0, index));
                    customerList.add(customer);
                } else {
                    String[] tokens = line.split("\\s");
                    if (line.contains(Account.CHECKING)) {
                        customerList.get(customerList.size() - 1)
                        .addAccount(new CheckingAccount(Long.parseLong(tokens[0]), 
                            Double.parseDouble(tokens[2])));
                    } else if (line.contains(Account.SAVINGS)) {
                        customerList.get(customerList.size() - 1)
                        .addAccount(new SavingsAccount(Long.parseLong(tokens[0]), 
                            Double.parseDouble(tokens[2])));
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get customer info.
     * @return the info
     */

    public String getCustomersInfoByIdOrder() {
        List<Customer> customerList = this.customerList;
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return Long.compare(o1.getIdNumber(), o2.getIdNumber());
            }
        });
        String info = "";
        for (int i = 0; i < customerList.size(); i++) {
            if (i == customerList.size() - 1) {
                info += customerList.get(i).getCustomerInfo();
            } else {
                info += customerList.get(i).getCustomerInfo() + "\n";
            }
        }
        return info;
    }

    /**
     * Get customer info.
     * @return the info
     */

    public String getCustomersInfoByNameOrder() {
        List<Customer> customerList = this.customerList;
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        String info = "";
        for (int i = 0; i < customerList.size(); i++) {
            if (i == customerList.size() - 1) {
                info += customerList.get(i).getCustomerInfo();
            } else {
                info += customerList.get(i).getCustomerInfo() + "\n";
            }
        }
        return info;
    }

    /**
     * Get customer info.
     * @return the info
     */

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
