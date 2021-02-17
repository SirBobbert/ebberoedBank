package services;

import model.Account;
import model.Customer;
import model.Transaction;
import util.Connector;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionService implements ITransactionService {
    @Override
    public List<Transaction> getAllTransactions() {

        List<Transaction> transactions = new ArrayList<>();

        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM transactions\n" +
                    "ORDER BY transactions.date ASC;", Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int amount = rs.getInt("amount");
                Date date = rs.getDate("date");

                Transaction transaction = new Transaction(amount, date);

                transactions.add(transaction);
            }

            for (Transaction i : transactions) {
                System.out.println(i);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Fejl: " + e.getMessage());
        }

        return transactions;
    }
}
