
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        int star = 0;
        while (index < array.length) {
            while (star < array[index]) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            star = 0;
            index++;
        }
    }

}
