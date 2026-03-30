import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();
    private boolean isNullOrEmpty(String title){
        if(title == null || title.trim().isEmpty()){
            return true;
        }
        return false;
    }
    private Book findBook(String title){
        for(Book book:books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    public void  adminUpdateBook (String title, String author, String publisher, String genre) {
        if(isNullOrEmpty(title)){
            System.out.println("\u001B[34m" + "Không tìm thấy sách");
            return;
        }
        Book book = findBook(title);
        if (!isNullOrEmpty(title)){
            book.setTitle(title);
        }
        if (!isNullOrEmpty(author)){
            book.setAuthor(author);
        }
        if (!isNullOrEmpty(publisher)){
            book.setPublisher(publisher);
        }
        if (!isNullOrEmpty(genre)){
            book.setGenre(genre);
        }
    }
    public void adminAddBook(String title, String author, String publisher, String genre) {
        Book book = new Book(title, author, publisher, genre);
        books.add(book);
    }
    public void adminDeleteBook(String title) {
        Book book = findBook(title);
        books.remove(book);
    }
    public void findBookAuthor(String author){
        int count = 1;
        for(Book book:books){
            if(book.getAuthor().equals(author)){
                System.out.printf("\u001B[34m" + "Sách thứ %d: %s - %s - %s - %s\n", count,  book.getTitle(), book.getAuthor(), book.getPublisher(), book.getGenre());
                count++;
            }
        }
    }
    public void findBookGenre(String genre){
        int count = 1;
        for(Book book:books){
            if(book.getGenre().equals(genre)){
                System.out.printf("\u001B[34m" + "Sách thứ %d: %s - %s - %s - %s\n", count,  book.getTitle(), book.getAuthor(), book.getPublisher(), book.getGenre());
                count++;
            }
        }
    }
    public void findBookPublisher(String publisher){
        int count = 1;
        for(Book book:books){
            if(book.getPublisher().equals(publisher)){
                System.out.printf("\u001B[34m" + "Sách thứ %d: %s - %s - %s - %s\n", count,  book.getTitle(), book.getAuthor(), book.getPublisher(), book.getGenre());
                count++;
            }
        }
    }
    public void bookShelf(){
        int count = 1;
        for(Book book:books){
            System.out.printf("\u001B[34m" + "Sách thứ %d: %s - %s - %s - %s\n", count,  book.getTitle(), book.getAuthor(), book.getPublisher(), book.getGenre());
            count++;
        }
    }

}
