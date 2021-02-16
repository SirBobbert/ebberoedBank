package model;

public class Account {

    int transactionsID;

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
