
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        //              0  1  2  3   4
        int[] array = {-1, 6, 9, 8, 12};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of smallest number: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 0));
        System.out.println(indexOfSmallestFrom(array, 1));
        System.out.println(indexOfSmallestFrom(array, 2));
        
        System.out.println();
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        
        System.out.println("\n\n");
        int[] ttttt = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(ttttt);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int index = 0; index < array.length; index++) {
            if (smallest > array[index]) {
                smallest = array[index];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int largestIndex = table.length;
        int smallestIndex = startIndex;
        int smallest = table[startIndex];
        while (startIndex < largestIndex) {
            if (smallest > table[startIndex]) {
                smallestIndex = startIndex;
                smallest = table[startIndex];
            }
            startIndex++;
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            if (array[index] != array[indexOfSmallestFrom(array, index)]) {
                System.out.println(Arrays.toString(array));
                swap(array, indexOfSmallestFrom(array, index), index);
                continue;
            }
            index++;
        }
    }

}
