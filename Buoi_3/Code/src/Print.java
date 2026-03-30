import java.util.Scanner;
public class Print {
    public static final
    Scanner sc = new Scanner(System.in);
    BookManager bookManager = new BookManager();
    public void permitManager(){
        System.out.println("\u001B[34m" + "Mời bạn chọn một trong những quyền sau:");
        System.out.println("\u001B[34m" + "1: Thêm sách mới");
        System.out.println("\u001B[34m" + "2: Xóa sách");
        System.out.println("\u001B[34m" + "3: Sửa sách");
        System.out.println("\u001B[34m" + "4: Các chức năng của khách");
        System.out.println("\u001B[34m" + "5: Xem sách hiện có");
        System.out.println("\u001B[34m" + "6: Thoát");
    }
    public void permitCustomer(){
        System.out.println("\u001B[34m" + "Mời bạn chọn một trong những quyền sau:");
        System.out.println("\u001B[34m" + "1: Tìm kiếm sách");
        System.out.println("\u001B[34m" + "2: Danh sách");
        System.out.println("\u001B[34m" + "3: Thoát");
    }
    public void invalidPassword(){
        System.out.println("\u001B[34m" + "Mật khẩu không chính xác, mời bạn chọn một trong những lệnh sau:");
        System.out.println("\u001B[34m" + "1: Nhập lại mật khẩu");
        System.out.println("\u001B[34m" + "2: Thoát");
    }
    public void getRole(){
        System.out.println("\u001B[34m" + "Nhập tài khoản: ");
    }
    public void getPassword(){
        System.out.println("\u001B[34m" + "Nhập mật khẩu:");
    }
    public void numOfBooks(){
        System.out.println("\u001B[34m" + "Số lượng sách muốn nhập là:");
        int count = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= count; i++){
            System.out.printf("\u001B[34m" + "Mời bạn nhập tên sách, tác giả, ngày xuất bản, thể loại của sách thứ %d\n", i);
            String  book_name = sc.nextLine();
            String book_author = sc.nextLine();
            String book_publisher = sc.nextLine();
            String book_genre = sc.nextLine();
            bookManager.adminAddBook(book_name, book_author, book_publisher, book_genre);
        }
    }
    public void deleteBook(){
        System.out.println("\u001B[34m" + "Nhập tiêu đề của sách muốn xóa");
        String book_name = sc.nextLine();
        bookManager.adminDeleteBook(book_name);
    }

    public void updateBook(){
        System.out.println("\u001B[34m" + "Nhập tên sách muốn sửa");
        String book_name = sc.nextLine();
        System.out.println("\u001B[34m" + "Nhập tên tác giả, ngày xuất bản, thể loại của sách muốn sửa có thể trống");
        String book_author = sc.nextLine();
        String book_publisher = sc.nextLine();
        String book_genre = sc.nextLine();
        bookManager.adminUpdateBook(book_name, book_author, book_publisher, book_genre);
    }
    public void findBook(){
        System.out.println("\u001B[34m" + "Chọn một trong những lệnh sau:");
        System.out.println("\u001B[34m" + "1: Tìm theo tác giả");
        System.out.println("\u001B[34m" + "2: Tìm theo thể loại");
        System.out.println("\u001B[34m" + "3: Tìm theo ngày xuất bản");
        int index = Integer.parseInt(sc.nextLine());
        if(index == 1) {
            System.out.println("\u001B[34m" + "Nhập tên tác giả:");
            String string =  sc.nextLine();
            bookManager.findBookAuthor(string);
        }
        else if(index == 2) {
            System.out.println("\u001B[34m" + "Nhập thể loại:");
            String string =  sc.nextLine();
            bookManager.findBookGenre(string);
        }
        else {
            System.out.println("\u001B[34m" + "Nhập ngày xuất bản:");
            String string =  sc.nextLine();
            bookManager.findBookPublisher(string);
        }
    }
    public void xem_sach(){
        bookManager.bookShelf();
    }

}
