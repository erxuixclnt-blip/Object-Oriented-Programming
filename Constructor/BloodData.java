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

            BloodData bd;

            if (input1.isEmpty() && input2.isEmpty()) {
                bd = new BloodData();
                  bd.display();
            } else {
               
                bd = new BloodData(input1, input2);
               bd.display(); 
               break;
            }
           

          

            System.out.println();

          
        }

       
    }
}

 class BloodData {

    static String bloodType;
    static String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

    public void display() {
        System.out.println(bloodType + rhFactor
                + " is added to the blood bank.");
    }
}
