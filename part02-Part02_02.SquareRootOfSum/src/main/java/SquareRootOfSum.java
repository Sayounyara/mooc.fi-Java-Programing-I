
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numb1 = Integer.valueOf(scan.nextLine());
        int numb2 = Integer.valueOf(scan.nextLine());
        
        double sqrt = Math.sqrt(numb1 + numb2);
        
        System.out.println(sqrt);

    }
}
