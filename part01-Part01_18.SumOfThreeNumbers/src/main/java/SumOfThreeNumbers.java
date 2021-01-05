
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int fir = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thi = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (fir + sec + thi));

    }
}
