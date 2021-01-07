public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthSeconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthSeconds = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredthSeconds.advance();
        
        if (this.hundredthSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredthSeconds;
    }
}
