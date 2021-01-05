
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int result = 1;
        if (number == 0) {
            System.out.println("Factorial: 1");
        } else {
            for (int factor = 1; factor <= number; factor++) {
                result *= factor;
            }
        }
        
        System.out.println("Factorial: " + result);

    }
}
