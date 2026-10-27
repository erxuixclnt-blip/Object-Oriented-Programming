import java.util.Scanner;
  
  class LabExer1 {
    
    public static void plusFive(double num1 ,double num2) {
    
    }    
        System.out.println("Plus Five");
        System.out.println((num1 + 5) + "" +(num2 + 5));
        
    public static void timesTwo(double num1, double num2) {
        
    }
        System.out.println(" Times Two");
        System.out.println((num1 * 2) + "" +(num2 * 2));
        
    public static void showSquared( double num1, double num2) {
        
        System.out.println("Squared");
        System.out.println((num1 * num1) + "" +(num2 * num2));
    }
    
    public static void computePercent (double num1 ,double num2) {
        
        double percent(num1 / num2) *100;
        System.out.println(num1 + " is " + percent + " percent of " + num2);
    
    }
    
    public static void main(String[] Args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first double value:");
        double num1 = scannernextDouble();
        
        System.out.print("Enter the second double value");
        double num2 = scannernextDouble();
        
        plusFive(num1,num2);
        timesTwo(num1,num2);
        showSquared(num1,num2);
        compuePercent(num1,num2);
        
        scannerclose();
    
    }
    
}
