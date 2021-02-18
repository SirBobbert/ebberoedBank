package services;

import model.Account;
import model.Customer;
import model.Transaction;
import util.Connector;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class AccountService implements IAccountService {


    @Override
    public void showTransactions() {

    }

    public int withdrawFunds(Account account, int amount) {
        account.getTransactionsList().add(new Transaction(amount * -1, new Date()));
        return account.getBalance();
    }

    @Override
    public int depositFunds(Account account, int amount) {
        account.getTransactionsList().add(new Transaction(amount, new Date()));
        return account.getBalance();
    }

    @Override
    public Account getAccountByID(int id) {

        Account account = null;
        try {

            Connection conn = Connector.connection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM accounts where ID = ?", Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int accountID = rs.getInt("id");
                int balance = rs.getInt("balance");

                account = new Account(id, balance, null);
            }


        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Fejl: " + e.getMessage());
        }

        return account;
    }

    @Override
    public int updateBalance() {
        return 0;
    }
}
