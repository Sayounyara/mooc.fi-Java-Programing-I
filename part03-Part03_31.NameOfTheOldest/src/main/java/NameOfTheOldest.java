
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldName = "";
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] nameAge = input.split(",");
            if (oldest < Integer.valueOf(nameAge[1])) {
                oldest = Integer.valueOf(nameAge[1]);
                oldName = nameAge[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldName);

    }
}
