package edu.cscc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author Ty Fogle
 */
public class CheckingAccount extends BankAccount {
    private int lastCheckNum;

    /**
     *
     * @param customerName
     * @param balance
     * @param lastCheckNum
     */
    public CheckingAccount(String customerName, double balance, int lastCheckNum) {
        super(customerName, balance);
        this.lastCheckNum = lastCheckNum;
    }

    /**
     * @return last check number
     */
    public int getLastCheckNum() {
        return lastCheckNum;
    }

    /**
     * @param lastCheckNum last check number
     */
    public void setLastCheckNum(int lastCheckNum) {
        this.lastCheckNum = lastCheckNum;
    }

    /**
     * Generate report for checking account
     */
    public void report() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Checking Account" + "\nCustomer Name: " + customerName +
                "\nBalance: $" + formatter.format(balance));
        System.out.println("Last check #: " + lastCheckNum);
    }
}
