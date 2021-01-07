
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (amount < 0) {
                    System.out.println();
                    continue;
                }
                first.add(amount);
            }
            
            if (command.equals("move")) {
                if (amount < 0) {
                    System.out.println();
                    continue;
                }
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }
            
            if (command.equals("remove")) {
                if (amount < 0) {
                    System.out.println();
                    continue;
                }
                second.remove(amount);
            }
            
            System.out.println();
        }
    }

}
