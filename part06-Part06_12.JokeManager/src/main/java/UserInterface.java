import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            
            processCommands(command);
        }
    }
    
    public void processCommands(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            this.manager.addJoke(joke);
        }
        if (command.equals("2")) {
            System.out.println("Drawing joke.");
            System.out.println(this.manager.drawJoke());
        }
        if (command.equals("3")) {
            System.out.println("Printing the jokes.");
            this.manager.printJokes();
        }
    }
}
