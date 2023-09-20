package Multibranching;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int i = 0;
        String dep = "deposit";
        String wit = "withdraw";
        String chBal = "check balance";
        double bal = 5000.00;
        double depLim = 10000.00;
        Scanner sc = new Scanner(System.in);

        while (i < 1) {
            System.out.println("Do you want to deposit, withdraw, or check balance?");
            String req = sc.nextLine();

            if (req.equalsIgnoreCase(dep)) {
                while (i < 1) {
                    System.out.println("How much would you like to deposit?");
                    double depReq = sc.nextDouble();
                    if (depReq <= depLim) {
                        System.out.println("New balance is $" + (bal + depReq));
                        i++;
                    } else {
                        System.out.println("You exceeded the deposit limit of $10,000.\ntry again");
                    }
                }
            } else if (req.equalsIgnoreCase(wit)) {
                while (i < 1) {
                    System.out.println("How much would you like to withdraw?");
                    double witReq = sc.nextDouble();
                    if (witReq <= bal) {
                        System.out.println("New balance is $" + (bal - witReq));
                        i++;
                    } else {
                        System.out.println("You are too broke to withdraw that much, buddy.\ntry again");
                    }
                }
            } else if (req.equalsIgnoreCase(chBal)) {
                System.out.println("your current balance is $" + bal);
            } else {
                System.out.println("Invalid option\ntry again");
            }
        }
    }
}
