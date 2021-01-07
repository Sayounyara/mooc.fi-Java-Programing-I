
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            list.add(input);
            total++;
        }
        
        System.out.println("");
        
        int sum = 0;
        for (int add: list) {
            sum += add;
        }
        // Alternately:
        /* for (int i = 0; i < list.size(); i++ {
               sum += list.get(i);
           }
        */
        // Or:
        /* int add = 0;
           while (add < list.size()) {
               sum += list.get(add);
               add++;
           }
        */
        
        double avg = 1.0 * sum / total;
        System.out.println("Average: " + avg);
        
    }
}
