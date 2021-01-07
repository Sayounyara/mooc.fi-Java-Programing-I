public class Container {
    private int maximum;
    private int current;
    
    public Container() {
        this.maximum = 100;
        this.current = 0;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.current += amount;
        if (this.current > this.maximum) {
            this.current = this.maximum;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.current -= amount;
        if (this.current < 0) {
            this.current = 0;
        }
    }
    
    public int contains() {
        return this.current;
    }
    
    @Override
    public String toString() {
        return this.current + "/" + this.maximum;
    }
}
