
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);
        Money c = a.minus(b);
        
        System.out.println(c.euros()); // 2
        System.out.println(c.cents());// 60
        System.out.println(c); // 2.60e
    }
}
