package model;

import java.util.List;

public class Account {

    private int id;
    private int balance;
    private List<Transaction> transactionsList;

    public Account(int id, int balance, List<Transaction> transactionsList) {
        this.id = id;
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
