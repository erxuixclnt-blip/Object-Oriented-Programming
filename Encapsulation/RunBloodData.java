package com.mycompany.runblooddata;

import java.util.Scanner;
public class RunBloodData {

    static boolean isInvalidType(String s) {
        return !s.isEmpty()
                && !s.equals("A")
                && !s.equals("B")
                && !s.equals("AB")
                && !s.equals("O");
    }

    static boolean isInvalidRh(String s) {
        return !s.isEmpty()
                && !s.equals("+")
                && !s.equals("-");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input1;
            String input2;

            do {
                System.out.print("Enter blood type of patient: ");
                input1 = sc.nextLine().trim().toUpperCase();
                if (isInvalidType(input1)) {
                    System.out.println("Invalid Input");
                }
            } while (isInvalidType(input1));

            do {
                System.out.print("Enter the Rhesus factor (+ or -): ");
                input2 = sc.nextLine().trim();
                if (isInvalidRh(input2)) {
                    System.out.println("Invalid Input");
                }
            } while (isInvalidRh(input2));

            BloodData bd = new BloodData();

            if (!input1.isEmpty() || !input2.isEmpty()) {
                bd.setBloodType(input1);
                bd.setRhFactor(input2);
            }

            System.out.println(bd.getBloodType() + bd.getRhFactor()
                    + " is added to the blood bank.");

            if (!input1.isEmpty() || !input2.isEmpty()) {
                break;
            }
            System.out.println();
        }
    }
}

class BloodData {

    private String bloodType;
    private String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}
