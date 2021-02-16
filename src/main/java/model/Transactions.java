package model;

import java.util.Date;

public class Transactions {

    private int amount;
    private Date date;

    public Transactions(int amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }
}
