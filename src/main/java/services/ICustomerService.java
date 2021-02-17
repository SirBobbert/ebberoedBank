package services;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    int withdrawFunds(int x);

    int depositFunds();

    void checkTransactions();

    List<Customer> getAllCustomers();

    Customer loginAs(int x);
}
