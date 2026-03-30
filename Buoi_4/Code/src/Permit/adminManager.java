package Permit;

import Item.book;
import Item.noteBook;
import Item.pen;
import Item.pencil;
import Ui.Print;
import java.util.Scanner;

public class adminManager {

    // Thao tác của sách
    Scanner sc = new Scanner(System.in);
    Print print = new  Print();
    public void addBook(){
        System.out.println("Số sách bạn muốn thêm: ");
        int count = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= count; i++){
            System.out.printf("Nhập tên của sách thứ %d\n", i);
            String name = sc.nextLine();
            System.out.printf("Nhập giá của sách thứ %d\n", i);
            double price = Double.parseDouble(sc.nextLine());
            System.out.printf("Nhập thương hiệu của sách thứ %d\n", i);
            String brand = sc.nextLine();
            System.out.printf("Nhập thể loại của sách thứ %d\n", i);
            String genre = sc.nextLine();
            System.out.printf("Nhập tác giả của sách thứ %d\n", i);
            String author = sc.nextLine();
            System.out.printf("Nhập nhà xuất bản của sách thứ %d\n", i);
            String publicer = sc.nextLine();
            System.out.printf("Nhập ngày xuất bản của sách thứ %d\n", i);
            int date = Integer.parseInt(sc.nextLine());
            System.out.printf("Nhập ngôn ngữ của sách thứ %d\n", i);
            String language = sc.nextLine();
            book book = new book(name, price, brand, genre, author,publicer, date, language);
            saveItem.insertBook(book);
        }
    }
    public void deleteBook(){
        System.out.println("Nhập đặc điểm bất kì về sách bạn muốn xóa");
        String feature =  sc.nextLine();
        saveItem.showFeature(feature);
    }
    public void updateBook(){
        System.out.println("Nhập đặc điểm bất kì về sách bạn muốn xóa");
        String feature = sc.nextLine();
        saveItem.updateBook(feature);
    }
    public void findBook(){
        System.out.println("Nhập đặc điểm bất kì về sách bạn muốn tìm");
        String feature = sc.nextLine();
        saveItem.findBook(feature);
    }
    public void bookOder(){
        int index = Integer.parseInt(sc.nextLine());
        switch (index){
            case 1:
                addBook();
                break;
            case 2:
                deleteBook();
                break;
            case 3:
                updateBook();
                break;
            case 4:
                findBook();
                break;
            case 5:
                saveItem.showBook();
                break;
            default:
                break;
        }
    }

    // Thao tác của vở ghi
    public void addNote(){
        System.out.println("Số vở ghi bạn muốn thêm: ");
        int count = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= count; i++){
            System.out.printf("Nhập tên của vở ghi thứ %d\n", i);
            String name = sc.nextLine();
            System.out.printf("Nhập giá của vở ghi thứ %d\n", i);
            double price = Double.parseDouble(sc.nextLine());
            System.out.printf("Nhập thương hiệu của vở ghi thứ %d\n", i);
            String brand = sc.nextLine();
            System.out.printf("Nhập số trang của vở ghi thứ %d\n", i);
            int numOfBook = Integer.parseInt(sc.nextLine());
            System.out.printf("Nhập loại vở của vở ghi thứ %d\n", i);
            String type = sc.nextLine();
            System.out.printf("Nhập màu sắc của vở ghi thứ %d\n", i);
            String color = sc.nextLine();
            System.out.printf("Nhập chất liệu giấy của vở ghi thứ %d\n", i);
            String paperMaterial =  sc.nextLine();
            System.out.printf("Nhập kích thước của vở ghi thứ %d\n", i);
            String size = sc.nextLine();
            noteBook notebook = new noteBook(name, price, brand, numOfBook, type, color, paperMaterial, size);
            saveItem.insertNote(notebook);
        }
    }
    public void deleteNote(){
        System.out.println("Nhập đặc điểm bất kì về vở ghi bạn muốn xóa");
        String feature =  sc.nextLine();
        saveItem.showFeatureNote(feature);
    }
    public void updateNote(){
        System.out.println("Nhập đặc điểm bất kì về vở ghi bạn muốn xóa");
        String feature = sc.nextLine();
        saveItem.updateNote(feature);
    }
    public void findNote(){
        System.out.println("Nhập đặc điểm bất kì về vở ghi bạn muốn tìm");
        String feature = sc.nextLine();
        saveItem.findNote(feature);
    }
    public void noteOder(){
        int index = Integer.parseInt(sc.nextLine());
        switch (index){
            case 1:
                addNote();
                break;
            case 2:
                deleteNote();
                break;
            case 3:
                updateNote();
                break;
            case 4:
                findNote();
                break;
            default:
                break;
        }
    }

    // Thao tác của bút chì
    public void addPencil(){
        System.out.println("Số bút chì bạn muốn thêm: ");
        int count = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= count; i++){
            System.out.printf("Nhập tên của bút chì thứ %d\n", i);
            String name = sc.nextLine();
            System.out.printf("Nhập giá của bút chì thứ %d\n", i);
            double price = Double.parseDouble(sc.nextLine());
            System.out.printf("Nhập thương hiệu của bút chì thứ %d\n", i);
            String brand = sc.nextLine();
            System.out.printf("Nhập màu sắc của bút chì thứ %d\n", i);
            String color =  sc.nextLine();
            System.out.printf("Nhập chất liệu của bút chì thứ %d\n", i);
            String material = sc.nextLine();
            System.out.printf("Nhập độ cứng của bút chì thứ %d\n", i);
            String type = sc.nextLine();
            pencil pencil = new pencil(name, price, brand, color, material, type);
            saveItem.insertPencil(pencil);
        }
    }
    public void deletePencil(){
        System.out.println("Nhập đặc điểm bất kì về bút chì bạn muốn xóa");
        String feature =  sc.nextLine();
        saveItem.showFeaturePencil(feature);
    }
    public void updatePencil(){
        System.out.println("Nhập đặc điểm bất kì về bút chì bạn muốn cập nhật");
        String feature = sc.nextLine();
        saveItem.updatePencil(feature);
    }
    public void findPencil(){
        System.out.println("Nhập đặc điểm bất kì về bút chì bạn muốn tìm");
        String feature = sc.nextLine();
        saveItem.findPencil(feature);
    }
    public void pencilOder(){
        int index = Integer.parseInt(sc.nextLine());
        switch (index){
            case 1:
                addPencil();
                break;
            case 2:
                deletePencil();
                break;
            case 3:
                updatePencil();
                break;
            case 4:
                findPencil();
                break;
            default:
                break;
        }
    }

    // Thao tác bút muc
    public void addPen(){
        System.out.println("Số bút mực bạn muốn thêm: ");
        int count = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= count; i++){
            System.out.printf("Nhập tên của vở ghi thứ %d\n", i);
            String name = sc.nextLine();
            System.out.printf("Nhập giá của vở ghi thứ %d\n", i);
            double price = Double.parseDouble(sc.nextLine());
            System.out.printf("Nhập thương hiệu của vở ghi thứ %d\n", i);
            String brand = sc.nextLine();
            System.out.printf("Nhập màu sắc của vở ghi thứ %d\n", i);
            String color =  sc.nextLine();
            System.out.printf("Nhập chất liệu của vở ghi thứ %d\n", i);
            String material = sc.nextLine();
            System.out.printf("Nhập loại mực của vở ghi thứ %d\n", i);
            String type = sc.nextLine();
            System.out.printf("Nhập độ mịn của vở ghi thứ %d\n", i);
            String smooth = sc.nextLine();
            pen pen = new pen(name,price , brand, color, material, type, smooth);
            saveItem.insertPen(pen);
        }
    }
    public void deletePen(){
        System.out.println("Nhập đặc điểm bất kì về bút mực bạn muốn xóa");
        String feature =  sc.nextLine();
        saveItem.showFeaturePen(feature);
    }
    public void penOder(){
        int index = Integer.parseInt(sc.nextLine());
        switch (index){
            case 1:
                addPen();
                break;
            case 2:
                deletePen();
                break;
            default:
                break;
        }
    }
    public void control(){
        while(true) {
            print.Out();
            int getItem = Integer.parseInt(sc.nextLine());
            boolean Break = false;
            switch (getItem){
                case 1:
                    print.bookOut();
                    bookOder();
                    break;
                case 2:
                    print.noteOut();
                    noteOder();
                    break;
                case 3:
                    print.pencilOut();
                    pencilOder();
                    break;
                case 4:
                    print.penOut();
                    penOder();
                    break;
                default:
                    Break = true;
                    break;
            }
            if(Break){
                break;
            }
        }
    }
}
