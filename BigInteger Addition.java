
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        BigInteger num1 = sc.nextBigInteger();

        System.out.print("Enter second number: ");
        BigInteger num2 = sc.nextBigInteger();

        BigInteger result = num1.add(num2);

        System.out.println("Addition = " + result);

        sc.close();
    }
}
