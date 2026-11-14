
import java.math.BigDecimal;
import java.util.Scanner;

public class AdvancedAddition {

    // Addition method
    public static BigDecimal add(
            BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   ADVANCED ADDITION SYSTEM");
        System.out.println("================================");

        try {
            System.out.print("Enter First Number: ");
            BigDecimal num1 = scanner.nextBigDecimal();

            System.out.print("Enter Second Number: ");
            BigDecimal num2 = scanner.nextBigDecimal();

            BigDecimal result = add(num1, num2);

            System.out.println("--------------------------------");
            System.out.println("First Number  : " + num1);
            System.out.println("Second Number : " + num2);
            System.out.println("Result        : " + result);
            System.out.println("--------------------------------");

            System.out.println("Addition Successful!");

        } catch (Exception e) {
            System.out.println("Invalid Input! Enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
