
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pos = 0;
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number < 0) {
                continue;
            }
            
            pos = pos + 1;
            sum = sum + number;
            
        }
        
        if (pos > 0) {
            double average = 1.0 * sum / pos;
            System.out.println(average);
        }
        
        System.out.println("Cannot calculate the average");
        
    }
}
