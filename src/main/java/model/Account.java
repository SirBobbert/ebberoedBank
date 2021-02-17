package model;

public class Account {

    private int balance;
    private int transactionsID;

    public Account(int transactionsID) {
        this.transactionsID = transactionsID;
    }

    @Override
    public String toString() {
        return "Account{" +
                "transactionsID=" + transactionsID +
                '}';
    }
}
