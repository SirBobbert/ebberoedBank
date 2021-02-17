package model;

import java.util.List;

public class Account {

    private int balance;
    private List<Transactions> transactionsList;

    public Account(int balance, List<Transactions> transactionsList) {
        this.balance = balance;
        this.transactionsList = transactionsList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", transactionsList=" + transactionsList +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
