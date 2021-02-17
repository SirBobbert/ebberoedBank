package controller;

import services.CustomerService;
import view.CustomerView;

import java.util.Scanner;

public class CustomerController {

    Scanner scanner = new Scanner(System.in);
    CustomerView customerView = new CustomerView();
    CustomerService customerService = new CustomerService();

    boolean program = true;
    int choice;


    public void runCustomerMenu() {

        while (program) {

            customerView.showCustomerMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Withdraw money");
                    customerService.withdrawFunds(0);
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
