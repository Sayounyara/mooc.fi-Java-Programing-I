
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number < 0) {
            int absol = number * -1;
            System.out.println(absol);
        } else {
            System.out.println(number);
        }

    }
}
