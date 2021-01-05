
public class AdvancedAstrology {

    public static void printStars(int number) {
        int repeat = 0;
        while (repeat < number) {
            System.out.print("*");
            repeat++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int repeat = 0;
        while (repeat < number) {
            System.out.print(" ");
            repeat++;
        }
    }

    public static void printTriangle(int size) {
        int space = size - 1;
        while (space >= 0) {
            printSpaces(space);
            printStars(size - space);
            space--;
        }
    }

    public static void christmasTree(int height) {
        int space = height - 1;
        int star = 1;
        while (space >= 0) {
            printSpaces(space);
            printStars(star);
            space--;
            star += 2;
        }
        
        space = height - 2;
        star = 3;
        for (int i = 0; i < 2; i++) {
            printSpaces(space);
            printStars(star);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
