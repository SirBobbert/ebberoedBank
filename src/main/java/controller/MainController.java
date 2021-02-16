package controller;

import view.MainView;

import java.util.Scanner;

public class MainController {

    Scanner scanner = new Scanner(System.in);

MainView m = new MainView();

    BankController bankController = new BankController();
    CustomerController customerController = new CustomerController();

    boolean program = true;
    int choice;

    public void run() {

        while (program) {
            m.showMainMenu();

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    customerController.runCustomerMenu();
                    break;
                case 2:
                    bankController.runBankMenu();
                    break;
                case 3:
                    program = false;
                    break;
            }
        }
    }
}
