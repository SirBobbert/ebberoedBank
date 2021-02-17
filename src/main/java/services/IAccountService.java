package services;

import model.Account;

public interface IAccountService {
    void showTransactions();
    //From ITransactionService

    int updateBalance();

    Account getAccountByID();
}
