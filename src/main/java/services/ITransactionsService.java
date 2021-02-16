package services;

import model.Transactions;

import java.util.List;

public interface ITransactionsService {
    List<Transactions> getAllTransactions();
    //From DB
}
