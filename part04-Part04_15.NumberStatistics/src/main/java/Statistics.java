public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        
    }
    
    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        if (getCount() == 0) {
            return 0;
        }
        
        return this.sum;
    }
    
    public double average() {
        if (getCount() == 0) {
            return 0;
        }
        return 1.0 * sum() / getCount();
    }
}
