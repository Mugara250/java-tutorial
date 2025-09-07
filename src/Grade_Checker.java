import java.util.Scanner;
import java.util.Locale;

public class Grade_Checker {
    public static void main(String[] args) {
        System.out.println("Welcome to a simple grade checking system!");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        enum PROCEED {
            YES, NO
        }

        while (true) {

            System.out.print("Do you want to proceed with checking your grades? (yes or no) ");
            String proceed = input.next();

            if (proceed.equals("no")) {
                break;
            }

            System.out.print("Enter your marks out of 100: ");
            double marks = input.nextDouble();

            if ((marks >= 89.0) && (marks <= 100.0)) {
                System.out.println("Your grade is A+. Excellent work! Keep it up!");
            } else if ((marks < 0) || (marks > 100)) {
                System.out.println("Invalid marks! Marks must be between 0 and 100");
            } else if ((marks >= 79.0) && (marks <= 89.0)) {
                System.out.println("Your grade is A. Great work! Keep it up!");
            } else if ((marks >= 69.0) && (marks <= 79.0)) {
                System.out.println("Your grade is B+. Wonderful! You can do better!");
            } else if ((marks >= 59.0) && (marks <= 69.0)) {
                System.out.println("Your grade is B. Good! You can do better!");
            } else if ((marks >= 49.0) && (marks <= 59.0)) {
                System.out.println("Your grade is C. Fair! Pull up your socks!");
            } else if ((marks >= 39.0) && (marks <= 49.0)) {
                System.out.println("Your grade is D. Not promising! Pull up your socks!");
            } else if ((marks >= 29.0) && (marks <= 39.0)) {
                System.out.println("Your grade is E. Not promising! Much effort is required!");
            } else {
                System.out.println("Your grade is F. Deeply worrying! Much much more effort is required!");
            }
        }
        System.out.println("Thank you for using the grade checking system!");
    }
}