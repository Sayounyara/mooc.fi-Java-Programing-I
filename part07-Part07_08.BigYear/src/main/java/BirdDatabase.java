
import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    private ArrayList<String> observations;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
        this.observations = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        if (birds.contains(bird)) {
            return;
        }
        birds.add(bird);
    }
    
    public Bird getBird(int index) {
        return this.birds.get(index);
    }
    
    public void observe(String bird) {
        observations.add(bird);
    }
    
    public boolean contains(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public int birdObservations(int birdIndex) {
        int timesObserved = 0;
        String birdName = birds.get(birdIndex).getName();
        for (int i = 0; i < observations.size(); i++) {
            if (observations.get(i).equals(birdName)) {
                timesObserved++;
            }
        }
        return timesObserved;
    }
    
    public int birds() {
        return this.birds.size();
    }
    
    public int birdObservations(String name) {
        int timesObserved = 0;
        int observationCount = this.observations.size();
        if (observationCount < 1) {
            observationCount = 1;
        }
        for (int i = 0; i < observationCount; i++) {
            if (this.observations.get(i).equals(name)) {
                timesObserved++;
            }
        }
        return timesObserved;
    }
}
