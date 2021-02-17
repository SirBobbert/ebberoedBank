package services;

import model.Account;
import model.Customer;
import util.Connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {

    List<Customer> allCustomers = getAllCustomers();

    @Override
    public int withdrawFunds(int x) {


        Customer customer = new Customer(0, "bob", "københavn", new Account(100, null));

        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE id = ?", Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, 1);
            stmt.setInt(2, 1);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int amount = rs.getInt("balance");

                System.out.println(amount);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Fejl: " + e.getMessage());
        }


        return 0;
    }

    @Override
    public int depositFunds() {
        return 0;
    }

    @Override
    public void checkTransactions() {

    }

    @Override
    public List<Customer> getAllCustomers() {

        List<Customer> customers = new ArrayList<>();

        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customers\n" +
                    "ORDER BY customers.id ASC;", Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");

                Customer c = new Customer(id, name, city, new Account(0, null));
                customers.add(c);
            }


        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Fejl: " + e.getMessage());
        }

        return customers;
    }

    private Customer loadCustomer(ResultSet rs) throws SQLException {
        return new Customer(
                rs.getInt("customer.id"),
                rs.getString("customer.name"),
                rs.getString("customer.city"),
                new Account(0, null)
        );
    }


    @Override
    public Customer loginAs(int x) {

        return allCustomers.get(x);
    }
}
