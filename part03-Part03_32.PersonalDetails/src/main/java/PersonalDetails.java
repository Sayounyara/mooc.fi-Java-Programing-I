
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // I should remake this code later...
        String name = "";
        int longest = 0;
        int sum = 0;
        int total = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] nameYear = input.split(",");
            
            String nameTest = nameYear[0];
            int length = nameTest.length();
            if (longest < length) {
                longest = length;
                name = nameYear[0];
            }
            sum += Integer.valueOf(nameYear[1]);
            total++;
        }
        
        System.out.println("");
        
        double avg = 1.0 * sum / total;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
        
    }
}
