import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private int currentWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.currentWeight = 0;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() > this.maximumWeight) {
            return;
        }
        items.add(item);
        this.currentWeight += item.getWeight();
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.size() == 0) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item reference: this.items) {
            if (heaviest.getWeight() < reference.getWeight()) {
                heaviest = reference;
            }
        }
        return heaviest;
    }
    
    public int totalWeight() {
        return this.currentWeight;
    }
    
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }
        String s = " (";
        if (this.items.size() != 1) {
            s = "s" + s;
        }
        return this.items.size() + " item" + s + this.currentWeight + " kg)";
    }
}
