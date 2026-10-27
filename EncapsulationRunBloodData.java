import java.util.Scanner;

public class RunBloodData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String input1;

            String input2;

            do {

                System.out.print("Enter blood type of patient: ");

                input1 = sc.nextLine().toUpperCase();

                if (!input1.isEmpty()
                        && !input1.equals("A")
                        && !input1.equals("B")
                        && !input1.equals("AB")
                        && !input1.equals("O")) {

                    System.out.println("Invalid Input");

                }

            } while (!input1.isEmpty()
                    && !input1.equals("A")
                    && !input1.equals("B")
                    && !input1.equals("AB")
                    && !input1.equals("O"));

            do {

                System.out.print("Enter the Rhesus factor (+ or -): ");

                input2 = sc.nextLine();

                if (!input2.isEmpty()
                        && !input2.equals("+")
                        && !input2.equals("-")) {

                    System.out.println("Invalid Input");

                }

            } while (!input2.isEmpty()
                    && !input2.equals("+")
                    && !input2.equals("-"));

            BloodData bd = new BloodData();

            if (input1.isEmpty() && input2.isEmpty()) {

                System.out.println(bd.getBloodType() + bd.getRhFactor()
                        + " is added to the blood bank.");

            } else {

                bd.setBloodType(input1);

                bd.setRhFactor(input2);

                System.out.println(bd.getBloodType() + bd.getRhFactor()
                        + " is added to the blood bank.");

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
