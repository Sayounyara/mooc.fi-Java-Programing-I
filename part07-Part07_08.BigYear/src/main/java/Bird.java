public class Bird {
    private String name;
    private String latinName;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    @Override
    public String toString() {
        return getName() + " (" + getLatinName() + ")";
    }
}
