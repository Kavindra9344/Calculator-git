import java.util.Scanner;
public class ATMSimulator {
    static double balance = 10000.00;
    public static void checkBalance() {
        System.out.println("Your current balance: Rs. " + balance);
    }
    public static void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
        System.out.println("Rs. " + amount + " deposited successfully.");
        System.out.println("New balance: Rs. " + balance);
    }
    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Rs. " + amount + " withdrawn successfully.");
            System.out.println("Remaining balance: Rs. " + balance);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("======= Welcome to ATM =======");
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = scanner.nextDouble();
                    deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double with = scanner.nextDouble();
                    withdraw(with);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
