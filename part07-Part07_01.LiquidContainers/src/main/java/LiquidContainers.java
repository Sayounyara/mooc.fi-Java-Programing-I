
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (amount < 0) {
                    System.out.println();
                    continue;
                }
                first += amount;
            }
            
            if (command.equals("move")) {
                if (amount < 0) {
                    System.out.println();
                    continue;
                }
                if (amount > first) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second += amount;
                }
            }
            
            if (command.equals("remove")) {
                if (amount < 0) {
                    System.out.println();
                    continue;
                }
                second -= amount;
            }
            
            System.out.println();
            
            if (first < 0) {
                first = 0;
            }
            if (first > 100) {
                first = 100;
            }
            
            if (second < 0) {
                second = 0;
            }
            if (second > 100) {
                second = 100;
            }

        }
    }

}
