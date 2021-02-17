package view;

import model.Customer;
import services.CustomerService;
import services.ICustomerService;

import java.util.List;


public class CustomerView {

    ICustomerService customerService = new CustomerService();

    List<Customer> allCustomers = customerService.getAllCustomers();

    public void showCustomerMenu() {

        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");
        System.out.println("3. Check transactions");
        System.out.println("4. Show all customers");
        System.out.println("5. Exit");
    }

    public void showAllCustomers() {
        for (Customer i : allCustomers) {
            System.out.println(i.toString());
        }

        System.out.println("Choose which customer you want to log in as:");
    }

}