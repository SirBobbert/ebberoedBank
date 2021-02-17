package model;

public class Customer {

    private int id;
    private String name;
    private String city;
    private Account account;

    public Customer(int id, String name, String city, Account account) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", account=" + account +
                '}';
    }

    public Account getAccount() {
        return account;
    }
}
