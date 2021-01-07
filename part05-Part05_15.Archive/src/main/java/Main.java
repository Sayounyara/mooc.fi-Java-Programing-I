
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        ArrayList<String> identifiers = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            if (identifiers.contains(id)) {
                continue;
            }
            identifiers.add(id);
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive item = new Archive(id, name);
            archives.add(item);
        }
        
        System.out.println();
        System.out.println("==Items==");
        for (Archive i: archives) {
            System.out.println(i);
        }

    }
}
