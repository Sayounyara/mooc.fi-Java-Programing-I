
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numbersInBounds = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                int row = Integer.valueOf(fileReader.nextLine());
                if (row <= upperBound && row >= lowerBound) {
                    numbersInBounds++;
                }
            }
        } catch (Exception e) {
            System.out.println("Failed to read file.");
        }
        
        System.out.println("Numbers: " + numbersInBounds);
    }

}
