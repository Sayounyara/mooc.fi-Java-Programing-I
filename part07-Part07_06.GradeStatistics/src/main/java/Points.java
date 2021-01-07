
import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    
    public Points() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }
    
    public void addPoints(int points) {
        if (points < 0 || points > 100) {
            return;
        }
        this.points.add(points);
        if (points > 49) {
            this.passingPoints.add(points);
        }
    }
    
    public double pointAverage() {
        int sum = 0;
        int total = 0;
        for (int i: this.points) {
            sum += i;
            total++;
        }
        return 1.0 * sum / total;
    }
    
    public double passingPointAverage() {
        if (this.passingPoints.isEmpty()) {
            return -1;
        }
        int sum = 0;
        int total = 0;
        for (int i: this.passingPoints) {
            sum += i;
            total++;
        }
        return 1.0 * sum / total;
    }
    
    public double passingPercentage() {
        return 100.0 * this.passingPoints.size() / this.points.size();
    }
    
    public void gradeDistribution() {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for (int i: this.points) {
            if (i > 89) {
                five = five + 1;
            } else if (i > 79) {
                four = four + 1;
            } else if (i > 69) {
                three = three + 1;
            } else if (i > 59) {
                two = two + 1;
            } else if (i > 49) {
                one = one + 1;
            } else {
                zero = zero + 1;
            }
        }
        
        System.out.println("5: " + printStars(five));
        System.out.println("4: " + printStars(four));
        System.out.println("3: " + printStars(three));
        System.out.println("2: " + printStars(two));
        System.out.println("1: " + printStars(one));
        System.out.println("0: " + printStars(zero));
    }
    
    public String printStars(int number) {
        String stars = "";
        for (int i = 0; i < number; i++) {
            stars = stars + "*";
        }
        return stars;
    }
}
