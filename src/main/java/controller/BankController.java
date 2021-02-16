package controller;

import view.BankView;

import java.util.Scanner;

public class BankController {

    boolean program = true;
    int choice;

    Scanner scanner = new Scanner(System.in);
    BankView bankView = new BankView();

    public void runBankMenu() {

        while (program) {

            bankView.showBankMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Transfer funds");
                    break;
                case 2:
                    System.out.println("Exit");
                    program = false;
                    break;
            }
        }
    }
}
