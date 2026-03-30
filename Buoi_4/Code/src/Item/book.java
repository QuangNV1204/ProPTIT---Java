package Item;

public class book extends item{
    private String genre;
    private String author;
    private String publisher;
    private int date;
    private String language;
    public book(String name, double price, String brand, String genre, String author, String publisher, int date, String language) {
        super(name, price, brand);
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
        this.date = date;
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getDate() {
        return date;
    }

    public String getLanguage() {
        return language;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
