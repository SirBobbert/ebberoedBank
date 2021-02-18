package controller;

import model.Account;
import model.Customer;
import services.AccountService;
import services.CustomerService;
import services.IAccountService;
import view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerController {

    Scanner scanner = new Scanner(System.in);
    CustomerView customerView = new CustomerView();
    CustomerService customerService = new CustomerService();
    IAccountService accountService = new AccountService();

    boolean program = true;
    int choice;
    int amount;
    Account currentAccount;


    public void runCustomerMenu() {

        customerView.showAllCustomers();
        int customerChoice = scanner.nextInt();
        Customer customer = customerService.loginAs(customerChoice);

        while (program) {

            customerView.showCustomerMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Withdraw funds");
                    customerView.promptForAmountToWithdraw();
                    amount = scanner.nextInt();
                    currentAccount = customer.getAccount();
                    accountService.withdrawFunds(currentAccount, amount);
                    System.out.println(currentAccount);
                    break;
                case 2:
                    System.out.println("Deposit money");
                    customerView.promptForAmountToDeposit();
                    amount = scanner.nextInt();
                    currentAccount = customer.getAccount();
                    accountService.depositFunds(currentAccount, amount);
                    System.out.println(currentAccount);
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
