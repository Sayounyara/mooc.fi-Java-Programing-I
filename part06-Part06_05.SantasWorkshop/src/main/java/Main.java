
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("48 Hours", 2);
        Package books = new Package();
        
        System.out.println(book.getName());
        System.out.println(book.getWeight());
        
        System.out.println();
        System.out.println(book);
        
        books.addGift(book);
        
        System.out.println(books.totalWeight());
    }
}
