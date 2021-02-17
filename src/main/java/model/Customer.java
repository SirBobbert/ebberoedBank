package model;

public class Customer {

    private String name;
    private String city;
    private Account account;

    public Customer(String name, String city, Account account) {
        this.name = name;
        this.city = city;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
