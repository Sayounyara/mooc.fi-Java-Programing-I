
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    // TODO:
    // class "mainProgram"
    // class "Bird"
    // make class "BirdDatabase"
    // make class "UserInterface"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();
        
        UserInterface ui = new UserInterface(scan, database);
        ui.start();
    }

}
