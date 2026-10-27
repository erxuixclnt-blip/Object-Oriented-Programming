import java.util.Scanner;

public class RunSavingsAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter interest rate: ");

        double rate = sc.nextDouble();

        SavingsAccount.setInterestRate(rate);

        System.out.print("Enter amount to deposit: ");

        double depositAmount = sc.nextDouble();

        savings.deposit(depositAmount);

        System.out.print("Press D to deposit again or W to withdraw: ");

        String choice = sc.next();

        if (choice.equalsIgnoreCase("D")) {

            System.out.print("Enter amount to deposit: ");

            double moreDeposit = sc.nextDouble();

            savings.deposit(moreDeposit);
            if (savings.getBalance() > 1000) {

            savings.addInterest();

            System.out.println("Interest applied. New balance:");

            SavingsAccount.showBalance(savings);

        }


        } else if (choice.equalsIgnoreCase("W")) {

            System.out.print("Enter amount to withdraw: ");

            double withdrawAmount = sc.nextDouble();

            double withdrawn = savings.withdraw(withdrawAmount);

              System.out.println("You Withdraw. "+ withdrawn);

        }

        SavingsAccount.showBalance(savings);

        
        sc.close();

    }

}


 

public class SavingsAccount {

    private double balance = 0;
    public static double interestRate = 0;

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double withdraw(double amount) {
        if ( balance >= amount) {
            balance -= amount;
            return amount;
        }
    else {
          System.out.println("Insufficient balance for withdrawal.");
          amount =0;
        }
        return amount;
    }  

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.deposit(1000);

        showBalance(account);
    }
}
