
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> oneTwoTre = new ArrayList<>();
        
        oneTwoTre.add("First");
        oneTwoTre.add("Second");
        oneTwoTre.add("Third");
        System.out.println(oneTwoTre);
        // Wow! That's cool. Doesn't need to be called the same as the method.
        removeLast(oneTwoTre);
        System.out.println(oneTwoTre);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
    }

}
