
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            sum += number;
            total++;
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        double average = 1.0 * sum / total;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
