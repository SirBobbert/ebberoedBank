package services;

import model.Account;
import model.Customer;
import util.Connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CustomerService implements ICustomerService {

    AccountService accountService = new AccountService();
    List<Customer> allCustomers = getAllCustomers();

    @Override
    public int withdrawFunds(Account account) {





        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE id = ?", Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, account.getBalance());
            stmt.setInt(2, 2);

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
        int id;

        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customers\n" +
                    "ORDER BY customers.id ASC;", Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                Account account = accountService.getAccountByID(id);

                Customer c = new Customer(id, name, city, account);
                customers.add(c);
            }


        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Fejl: " + e.getMessage());
        }

        return customers;
    }

    @Override
    public Customer loginAs(int x) {

        return allCustomers.get(x - 1);
    }
}
