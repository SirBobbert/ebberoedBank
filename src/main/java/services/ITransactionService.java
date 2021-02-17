package services;

import model.Transaction;

import java.util.List;

public interface ITransactionService {
    List<Transaction> getAllTransactions();
    //From DB
}
