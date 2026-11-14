
import java.math.BigDecimal;
import java.util.Scanner;

public class AdvancedAddition {

    // Method to add two numbers
    public static BigDecimal addNumbers(
            BigDecimal num1, BigDecimal num2) {

        return num1.add(num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Advanced Addition Calculator ===");

            System.out.print("Enter first number: ");
            BigDecimal num1 = sc.nextBigDecimal();

            System.out.print("Enter second number: ");
            BigDecimal num2 = sc.nextBigDecimal();

            BigDecimal result = addNumbers(num1, num2);

            System.out.println("-----------------------------");
            System.out.println("First Number  : " + num1);
            System.out.println("Second Number : " + num2);
            System.out.println("Addition      : " + result);
            System.out.println("-----------------------------");

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            sc.close();
            System.out.println("Program Completed!");
        }
    }
}
