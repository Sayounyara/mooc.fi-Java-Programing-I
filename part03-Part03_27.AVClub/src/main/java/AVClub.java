
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String avTest = scanner.nextLine();
            if (avTest.equals("")) {
                break;
            }
            
            String[] wordBreak = avTest.split(" ");
            for (String i: wordBreak) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
        }

    }
}
