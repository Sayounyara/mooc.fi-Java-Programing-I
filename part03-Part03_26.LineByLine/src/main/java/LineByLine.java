
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String read = scanner.nextLine();
            String[] space = read.split(" ");
            for (String i: space) {
                System.out.println(i);
            }
            
            if (!(read.contains(" "))) {
            break;
            }
        }

    }
}
