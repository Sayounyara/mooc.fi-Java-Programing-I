
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int y = Integer.valueOf(scanner.nextLine());
        
        int plus = x + y;
        int minus = x - y;
        int times = x * y;
        double divide = 1.0 * x / y;
        
        System.out.println(x + " + " + y + " = " + plus);
        System.out.println(x + " - " + y + " = " + minus);
        System.out.println(x + " * " + y + " = " + times);
        System.out.println(x + " / " + y + " = " + divide);

    }
}
