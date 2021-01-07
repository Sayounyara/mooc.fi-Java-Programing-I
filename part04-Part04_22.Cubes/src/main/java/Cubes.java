
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String toCube = scanner.nextLine();
            if (toCube.equals("end")) {
                break;
            }
            
            int cubert = Integer.valueOf(toCube);
            System.out.println(cube(cubert));
        }

    }
    
    public static int cube(int toCube) {
        int xCubed = toCube * toCube * toCube;
        return xCubed;
    }
}
