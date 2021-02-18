package model;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int id;
    private int balance;
    private List<Transaction> transactionsList;

    public List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public Account(int id, int balance, List<Transaction> transactionsList) {
        this.id = id;
        this.balance = balance;
        this.transactionsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", transactionsList=" + transactionsList +
                '}';
    }

    public int getBalance() {
        for (Transaction i : transactionsList) {
            balance += i.getAmount();
        }
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
