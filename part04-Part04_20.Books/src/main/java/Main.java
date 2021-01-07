import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println();
        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();
        if (info.equals("everything")) {
            for (Book index: books) {
                System.out.println(index);
            }
        }
        if (info.equals("name")) {
            for (Book index: books) {
                System.out.println(index.getTitle());
            }
        }

    }
}
