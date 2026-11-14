
import java.math.BigDecimal;
import java.util.Scanner;

public class AdvancedSubtraction {

    public static BigDecimal subtract(
            BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Advanced Subtraction ===");

            System.out.print("Enter First Number: ");
            BigDecimal num1 = sc.nextBigDecimal();

            System.out.print("Enter Second Number: ");
            BigDecimal num2 = sc.nextBigDecimal();

            BigDecimal result = subtract(num1, num2);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Invalid Input!");
        } finally {
            sc.close();
        }
    }
}
