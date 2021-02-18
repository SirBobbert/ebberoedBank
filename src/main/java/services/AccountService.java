package services;

import model.Account;
import model.Transaction;

import java.util.Date;
import java.util.List;

public class AccountService implements IAccountService {


    @Override
    public void showTransactions() {

    }

    public int withdrawFunds(Account account, int amount) {
        account.getTransactionsList().add(new Transaction(-amount, new Date()));
        return account.getBalance();
    }

    @Override
    public int depositFunds(Account account, int amount) {
        account.getTransactionsList().add(new Transaction(amount, new Date()));
        return account.getBalance();
    }

    @Override
    public Account getAccountByID() {
        return null;
    }

    @Override
    public int updateBalance() {
        return 0;
    }
}
