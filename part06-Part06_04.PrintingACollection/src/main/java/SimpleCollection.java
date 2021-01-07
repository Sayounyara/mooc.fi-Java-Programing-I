
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        int index = 0;
        String elements = "";
        for (String collect: this.elements) {
            elements = elements + "\n" + this.elements.get(index);
            index++;
        }
        
        String colon = "s:";
        if (this.elements.size() == 1) {
            colon = ":";
        }
        
        return "The collection " + this.name + " has " + this.elements.size() +
                " element" + colon + elements;
    }
    
}
