package services;

import model.Account;

public interface IAccountService {
    void showTransactions();
    //From ITransactionService

    int updateBalance();

    int withdrawFunds(Account account, int amount);

    int depositFunds(Account account, int amount);

    Account getAccountByID();
}
