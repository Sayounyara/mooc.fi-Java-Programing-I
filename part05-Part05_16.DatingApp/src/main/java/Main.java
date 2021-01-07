
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 4, 2009);
        
        System.out.println(date);
        date.advance();
        System.out.println(date);
        date.advance(6);
        System.out.println(date);
        date.advance(9);
        System.out.println(date);
        date.advance();
        System.out.println(date);
    }
}
