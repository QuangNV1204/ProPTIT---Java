public class Book {
    String title;
    String author;
    String publisher;
    String genre;
    public Book(String title, String author, String publisher, String genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
