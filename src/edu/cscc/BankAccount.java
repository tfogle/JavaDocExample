package edu.cscc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @
 */
public abstract class BankAccount {
    protected String customerName;
    protected double balance;

    /**
     *
     * @param customerName
     * @param balance
     */
    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    /**
     * @return customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName customer name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance - account balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Generate a report for account (abstract method)
     */
    abstract public void report();
}