package services;

import util.Connector;

import java.sql.*;

public class CustomerService implements ICustomerService{

    @Override
    public int withdrawFunds(int x) {



        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM transactions", Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int amount = rs.getInt("amount");

                System.out.println(id + " " + amount);
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
