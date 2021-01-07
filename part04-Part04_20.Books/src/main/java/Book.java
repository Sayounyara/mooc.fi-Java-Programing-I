public class Book {
    private String title;
    private int pages;
    private int published;
    
    public Book(String title, int pages, int published) {
        this.title = title;
        this.pages = pages;
        this.published = published;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.published;
    }
}
