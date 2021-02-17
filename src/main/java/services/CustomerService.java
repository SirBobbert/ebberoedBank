package services;

import model.Account;
import model.Customer;
import util.Connector;

import java.sql.*;

public class CustomerService implements ICustomerService {

    @Override
    public int withdrawFunds(int x) {

        Customer customer = new Customer("bob", "københavn", new Account(100, null));

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
}
