package controller;

import model.Customer;
import services.CustomerService;
import view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerController {

    Scanner scanner = new Scanner(System.in);
    CustomerView customerView = new CustomerView();
    CustomerService customerService = new CustomerService();

    boolean program = true;
    int choice;


    public void runCustomerMenu() {

        List<Customer> allCustomers = customerService.getAllCustomers();

        customerView.showAllCustomers();
        int customerChoice = scanner.nextInt();
        Customer customer = customerService.loginAs(customerChoice);

        while (program) {

            customerView.showCustomerMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Withdraw money");
                    customerService.withdrawFunds(customer.getAccount());
                    break;
                case 2:
                    System.out.println("Deposit money");
                    break;
                case 3:
                    System.out.println("Check transactions");
                    break;
                case 4:
                    customerService.getAllCustomers();
                    break;
                case 5:
                    System.out.println("Back");
                    program = false;
                    break;
            }
        }
    }
}
