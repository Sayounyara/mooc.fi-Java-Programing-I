
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private Points grades;
    
    public TextUI(Scanner scanner, Points points) {
        this.scanner = scanner;
        this.grades = points;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            grades.addPoints(input);
        }
        
        System.out.println("Point average (all): " + grades.pointAverage());
        if (grades.passingPointAverage() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grades.passingPointAverage());
        }
        System.out.println("Pass percentage: " + grades.passingPercentage());
        
        System.out.println("Grade distribution:");
        grades.gradeDistribution();
    }
    
}
