public class Whistle {
    private String whistle;
    
    public Whistle(String whistleSound) {
        this.whistle = whistleSound;
    }
    
    public void sound() {
        System.out.println(this.whistle);
    }
}
