import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }
        if (command.equals("remove")) {
            remove();
        }
        if (command.equals("list")) {
            list();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String add = scanner.nextLine();
        this.list.add(add);
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int remove = Integer.valueOf(scanner.nextLine());
        this.list.remove(remove);
    }
    
    public void list() {
        this.list.print();
    }
}
