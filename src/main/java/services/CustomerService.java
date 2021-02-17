package services;

import model.Account;
import model.Customer;
import util.Connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {

    @Override
    public int withdrawFunds(int x) {

<<<<<<< HEAD
=======
        Customer customer = new Customer(0, "bob", "københavn", new Account(100, null));

>>>>>>> bobbertBranch
        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM accounts WHERE customerID = ?", Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, 1);

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

            for (Customer i : customers) {
                System.out.println(i.toString());
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Fejl: " + e.getMessage());
        }

        return customers;
    }
}
