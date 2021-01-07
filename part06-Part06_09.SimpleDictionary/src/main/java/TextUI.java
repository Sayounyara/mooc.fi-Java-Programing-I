import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                add();
                continue;
            }
            if (input.equals("search")) {
                search();
                continue;
            }
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String toBeTranslated = this.scanner.nextLine();
        if (this.dictionary.contains(toBeTranslated)) {
            System.out.print("Translation: ");
            System.out.println(this.dictionary.translate(toBeTranslated));
        } else {
            System.out.println("Word " + toBeTranslated + " was not found");
        }
        
    }
}
