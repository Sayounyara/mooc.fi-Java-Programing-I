import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person shortest = this.people.get(0);
        for (Person reference: this.people) {
            if (shortest.getHeight() > reference.getHeight()) {
                shortest = reference;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person temp = shortest();
        this.people.remove(temp);
        return  temp;
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
}
