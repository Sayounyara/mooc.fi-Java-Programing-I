
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BirdDatabase data;
    
    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scan = scanner;
        this.data = database;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            
            processCommand(input);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("Add")) { // add a bird
            add();
        }
        if (command.equals("Observation")) { // observe a bird already in the database
            observe();
        }
        if (command.equals("All")) { // shows all bird observations
            all();
        }
        if (command.equals("One")) { // shows one specific bird observation
            one();
        }
    }
    
    public void add() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        data.addBird(new Bird(name, latinName));
    }
    
    public void observe() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        if (data.contains(name)) {
            data.observe(name);
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void all() {
        for (int i = 0; i < data.birds(); i++) {
            if (data.birdObservations(i) == 1) {
                System.out.println(data.getBird(i) + ": 1 observation");
            } else {
                System.out.println(data.getBird(i) + ": " + data.birdObservations(i) + " observations");
            }
        }
    }
    
    public void one() {
        System.out.print("Bird? ");
        String name = scan.nextLine();
        if (data.contains(name)) { // AAAAAUUUUUUUGGGGGHHHHHHH.~ATH
            for (int i = 0; i < data.birds(); i++) {
                if (data.getBird(i).getName().equals(name)) { 
                    if (data.birdObservations(i) == 1) {
                        System.out.println(data.getBird(i) + ": " + data.birdObservations(i) + " observation");
                    } else {
                        System.out.println(data.getBird(i) + ": " + data.birdObservations(i) + " observations");
                    }
                }
            }
        } else {
            System.out.println("Not a Bird!");
        }
    }
}
