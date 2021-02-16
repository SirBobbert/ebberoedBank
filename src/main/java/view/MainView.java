package view;

import controller.MainController;

public class MainView {
    public static void main(String[] args) {
        MainController c = new MainController();
        c.run();
    }

    public void showMainMenu() {
        System.out.println("Pick one of the follwing:");
        System.out.println("1. Customer");
        System.out.println("2. Bank");
    }
}
