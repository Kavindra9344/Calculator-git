import java.util.Scanner;

public class StudentGradeCalculator {

    public static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];
        int[] marks = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter marks (0-100): ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("\n===== Grade Report =====");
        System.out.printf("%-20s %-10s %-5s%n", "Name", "Marks", "Grade");
        System.out.println("--------------------------------");
        for (int i=0;i<n;i++) {
            System.out.printf("%-20s %-10d %-5s%n", names[i], marks[i], getGrade(marks[i]));
        }
        System.out.println("================================");
    }
}