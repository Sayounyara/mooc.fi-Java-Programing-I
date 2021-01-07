public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String id, String name) {
        this.identifier = id;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        return this.identifier.equals(comparedArchive.identifier) && this.name.equals(comparedArchive.name);
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
