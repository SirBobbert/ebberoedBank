package model;

public class Bank {

    private String name;
    private String city;
    private int customerID;

    public Bank(String name, String city, int customerID) {
        this.name = name;
        this.city = city;
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", customerID=" + customerID +
                '}';
    }
}
