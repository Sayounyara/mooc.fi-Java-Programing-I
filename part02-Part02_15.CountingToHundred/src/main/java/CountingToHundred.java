
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int low = Integer.valueOf(scanner.nextLine());
        int high = 100;
        
        while (low <= high) {
            System.out.println(low);
            low++;
        }
        

    }
}
