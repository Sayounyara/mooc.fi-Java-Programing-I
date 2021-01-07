import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() > this.maximumWeight) {
            return;
        }
        
        suitcases.add(suitcase);
        this.currentWeight += suitcase.totalWeight();
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }
}
