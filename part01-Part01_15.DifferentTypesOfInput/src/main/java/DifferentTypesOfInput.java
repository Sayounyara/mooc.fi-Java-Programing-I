
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scanner.nextLine();
        System.out.println("Give an integer:");
        int numb = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double deci = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numb);
        System.out.println("You gave the double " + deci);
        System.out.println("You gave the boolean " + bool);

    }
}
