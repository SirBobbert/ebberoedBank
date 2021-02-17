package services;

import model.Account;
import model.Customer;

import java.util.List;

public interface ICustomerService {
    int withdrawFunds(Account account);

    int depositFunds();

    void checkTransactions();

    List<Customer> getAllCustomers();

    Customer loginAs(int x);
}
