
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        
        String input = scanner.nextLine();
        //Asks for an imput
        
        //Prints three times
        System.out.println(input);
        System.out.println(input);
        System.out.println(input);
        
    }
}
