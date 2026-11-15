class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calculateSum() {
        return num1 + num2;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator obj = new Calculator(150, 250);

        System.out.println("Total = " + obj.calculateSum());
    }
}
