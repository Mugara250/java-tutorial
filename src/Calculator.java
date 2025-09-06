import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a small mini calculator that does the basic arithmetic operations.");

        while (true) {
            System.out.print("Do you wish to proceed with your calculations? (yes or no) ");
            String proceed = input.next();
            if (proceed.equals("no")) {
                break;
            }
            System.out.print("Enter the first operand: ");
            int operand1 = input.nextInt();

            System.out.print("Enter the second operand: ");
            int operand2 = input.nextInt();

            System.out.print("Enter the operator: ");
            String operator = input.next();

            switch (operator) {
                case "+":
                    System.out.println(operand1 + operand2);
                    break;
                case "-":
                    System.out.println(operand1 - operand2);
                    break;
                case "*":
                    System.out.println(operand1 * operand2);
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("You can't divide by zero");
                    } else {
                        System.out.println(operand1 / operand2);
                    }
                    break;
                case "%":
                    System.out.println(operand1 % operand2);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
        System.out.println("Thank you for using this mini calculator!");
    }
}