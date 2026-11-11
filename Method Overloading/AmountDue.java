package com.mycompany.runamountdue;

import java.util.Scanner;

public class RunAmountDue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Press any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity, and discount amount");

        int choice = (int) sc.nextDouble();

        if (choice == 1) {
            double price = sc.nextDouble();
            System.out.println("Amount due is " + due.computeAmountDue(price));
        } else if (choice == 2) {
            double price = sc.nextDouble();
            double quantity = sc.nextDouble();
            System.out.println("Amount due is " + due.computeAmountDue(price, quantity));
        } else if (choice == 3) {
            double price = sc.nextDouble();
            double quantity = sc.nextDouble();
            double discount = sc.nextDouble();
            System.out.println("Amount due is " + due.computeAmountDue(price, quantity, discount));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

package com.mycompany.runamountdue;

class AmountDue {

    double computeAmountDue(double price) {
        return price + (price * 0.12);
    }

    double computeAmountDue(double price, double quantity) {
        double total = price * quantity;
        return total + (total * 0.12);
    }

    double computeAmountDue(double price, double quantity, double discount) {
        double total = (price * quantity) - discount;
        return total + (total * 0.12);
    }
}
