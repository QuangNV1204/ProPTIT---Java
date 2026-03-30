package Permit;
import Item.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class saveItem {
    private static ArrayList<item> items = new ArrayList<item>();

    // Thao tác của sách
    public static void insertBook(book book) {
        items.add(book);
    }

    public static void showBook() {
        int count = 0;
        for (item i : items) {
            System.out.println("Danh sách sách tìm được: ");
            if (i instanceof book) {
                count++;
                System.out.println("------");
                System.out.printf("Tên sách: %s\n", i.getName());
                System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                System.out.printf("Thương hiệu: %s\n", i.getBrand());
                System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                System.out.println("------");
            }
        }
        if (count == 0) {
            System.out.println("Không tìm được sách nào !");
        }
    }

    public static void showFeature(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof book) {
                count++;
                if (feature.equals(((book) i).getGenre())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getAuthor())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getLanguage())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getName())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getPublisher())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                }
            }
        }
        if (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập chỉ số của sách bạn muốn xóa: ");
            int index = Integer.parseInt(sc.nextLine());
            items.remove(saveBook.get(index - 1));
        } else if (count == 0) {
            System.out.println("Không tìm được sách nào !");
        }
    }

    public static void updateBook(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof book) {
                if (feature.equals(((book) i).getGenre())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getAuthor())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getLanguage())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getName())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getPublisher())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                }
            }
        }
        if (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập chỉ số của sách bạn muốn sửa: ");
            int index = Integer.parseInt(sc.nextLine());
            book selected = (book) saveBook.get(index - 1);
            int globalIndex = items.indexOf(selected);
            if (globalIndex == -1) {
                System.out.println("Lỗi: không tìm thấy sách trong danh sách chính.");
                return;
            }
            System.out.printf("Nhập tên mới (Enter để giữ nguyên: %s): ", selected.getName());
            String name = sc.nextLine();
            if (!name.isEmpty()) selected.setName(name);
            System.out.printf("Nhập giá mới (Enter để giữ nguyên: %d): ", (int) selected.getPrice());
            String priceStr = sc.nextLine();
            if (!priceStr.isEmpty()) selected.setPrice(Double.parseDouble(priceStr));
            System.out.printf("Nhập thương hiệu mới (Enter để giữ nguyên: %s): ", selected.getBrand());
            String brand = sc.nextLine();
            if (!brand.isEmpty()) selected.setBrand(brand);
            System.out.printf("Nhập thể loại mới (Enter để giữ nguyên: %s): ", selected.getGenre());
            String genre = sc.nextLine();
            if (!genre.isEmpty()) selected.setGenre(genre);
            System.out.printf("Nhập tác giả mới (Enter để giữ nguyên: %s): ", selected.getAuthor());
            String author = sc.nextLine();
            if (!author.isEmpty()) selected.setAuthor(author);
            System.out.printf("Nhập nhà xuất bản mới (Enter để giữ nguyên: %s): ", selected.getPublisher());
            String publisher = sc.nextLine();
            if (!publisher.isEmpty()) selected.setPublisher(publisher);
            System.out.printf("Nhập ngày xuất bản mới (Enter để giữ nguyên: %d): ", selected.getDate());
            String dateStr = sc.nextLine();
            if (!dateStr.isEmpty()) {
                int dateINT = Integer.parseInt(dateStr);
                selected.setDate(dateINT);
            }
            System.out.printf("Nhập ngôn ngữ mới (Enter để giữ nguyên: %s): ", selected.getLanguage());
            String language = sc.nextLine();
            if (!language.isEmpty()) selected.setLanguage(language);
            System.out.println("Đã cập nhật sách.");
        } else if (count == 0) {
            System.out.println("Không tìm được sách nào !");
        }
    }

    public static void findBook(String feature) {
        int count = 0;
        for (item i : items) {
            if (i instanceof book) {
                count++;
                if (feature.equals(((book) i).getGenre())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getAuthor())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getLanguage())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getName())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                } else if (feature.equals(((book) i).getPublisher())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Sách thứ: %d\n", count);
                    System.out.printf("Tên sách: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Thể loại: %s\n", ((book) i).getGenre());
                    System.out.printf("Tác giả: %s\n", ((book) i).getAuthor());
                    System.out.printf("Nhà xuất bản: %s\n", ((book) i).getPublisher());
                    System.out.printf("Ngày xuất bản: %d\n", ((book) i).getDate());
                    System.out.printf("Ngôn ngữ: %s\n", ((book) i).getLanguage());
                    System.out.println("------");
                }
            }
        }
    }

    // Thao tác của vở ghi
    public static void insertNote(noteBook noteBook) {
        items.add(noteBook);
    }

    public static void showFeatureNote(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof noteBook) {
                if (feature.equals(((noteBook) i).getType())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getName())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getSize())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getBrand())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                }
            }
        }
        if (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập chỉ số của vở ghi bạn muốn xóa: ");
            int index = Integer.parseInt(sc.nextLine());
            items.remove(saveBook.get(index - 1));
        } else if (count == 0) {
            System.out.println("Không tìm được vở ghi nào !");
        }
    }

    public static void updateNote(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof noteBook) {
                if (feature.equals(((noteBook) i).getType())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getName())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getSize())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getNumOfPage())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getBrand())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                }
            }
        }
        if (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập chỉ số của vở ghi bạn muốn sửa: ");
            int index = Integer.parseInt(sc.nextLine());
            noteBook selected = (noteBook) saveBook.get(index - 1);
            int globalIndex = items.indexOf(selected);
            if (globalIndex == -1) {
                System.out.println("Lỗi: không tìm thấy vở ghi trong danh sách chính.");
                return;
            }
            System.out.printf("Nhập tên mới (Enter để giữ nguyên: %s): ", selected.getName());
            String name = sc.nextLine();
            if (!name.isEmpty()) selected.setName(name);
            System.out.printf("Nhập giá mới (Enter để giữ nguyên: %d): ", (int) selected.getPrice());
            String priceStr = sc.nextLine();
            if (!priceStr.isEmpty()) selected.setPrice(Double.parseDouble(priceStr));
            System.out.printf("Nhập thương hiệu mới (Enter để giữ nguyên: %s): ", selected.getBrand());
            String brand = sc.nextLine();
            if (!brand.isEmpty()) selected.setBrand(brand);
            System.out.printf("Nhập số trang mới (Enter để giữ nguyên: %d): ", selected.getNumOfPage());
            String numStr = sc.nextLine();
            if (!numStr.isEmpty()) {
                int dateINT = Integer.parseInt(numStr);
                selected.setNumOfPage(dateINT);
            }
            System.out.printf("Nhập loai vở mới (Enter để giữ nguyên: %s): ", selected.getType());
            String type = sc.nextLine();
            if (!type.isEmpty()) selected.setType(type);
            System.out.printf("Nhập màu sắc mới (Enter để giữ nguyên: %s): ", selected.getColor());
            String color = sc.nextLine();
            if (!color.isEmpty()) selected.setColor(color);
            System.out.printf("Nhập chất liệu giấy mới (Enter để giữ nguyên: %s): ", selected.getPaperMaterial());
            String paper = sc.nextLine();
            if (!paper.isEmpty()) selected.setPaperMaterial(paper);
            System.out.printf("Nhập kích thước mới (Enter để giữ nguyên: %s): ", selected.getSize());
            String size = sc.nextLine();
            if (!size.isEmpty()) selected.setSize(size);
            System.out.println("Đã cập nhật sách.");
        } else if (count == 0) {
            System.out.println("Không tìm được vở ghi nào !");
        }
    }

    public static void findNote(String feature) {
        int count = 0;
        for (item i : items) {
            if (i instanceof noteBook) {
                if (feature.equals(((noteBook) i).getType())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getName())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getSize())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getNumOfPage())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                } else if (feature.equals(((noteBook) i).getBrand())) {
                    count++;
                    System.out.println("------");
                    System.out.printf("Vở ghi thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Số trang sách: %d\n", ((noteBook) i).getNumOfPage());
                    System.out.printf("Loại sách: %s\n", ((noteBook) i).getType());
                    System.out.printf("Màu sắc: %s\n", ((noteBook) i).getColor());
                    System.out.printf("Chất liệu giấy: %s\n", ((noteBook) i).getPaperMaterial());
                    System.out.printf("Kích thước: %s\n", ((noteBook) i).getSize());
                    System.out.println("------");
                }
            }
        }
    }

    // Thao tác bút chì
    public static void insertPencil(pencil pencil) {
        items.add(pencil);
    }

    public static void showFeaturePencil(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof pencil) {
                if (feature.equals(((pencil) i).getName())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                    System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                    System.out.println("------");
                } else if (feature.equals(((pencil) i).getColor())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                    System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                    System.out.println("------");
                } else if (feature.equals(((pencil) i).getMaterial())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                    System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                    System.out.println("------");
                } else if (feature.equals(((pencil) i).getString())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                    System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                    System.out.println("------");
                }
            }
        }
        if (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập chỉ số của bút chì bạn muốn xóa: ");
            int index = Integer.parseInt(sc.nextLine());
            items.remove(saveBook.get(index - 1));
        } else if (count == 0) {
            System.out.println("Không tìm được bút chì nào !");
        }
    }

    public static void updatePencil(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof pencil) {
                if (i instanceof pencil) {
                    if (feature.equals(((pencil) i).getName())) {
                        saveBook.add(i);
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    } else if (feature.equals(((pencil) i).getColor())) {
                        saveBook.add(i);
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    } else if (feature.equals(((pencil) i).getMaterial())) {
                        saveBook.add(i);
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    } else if (feature.equals(((pencil) i).getString())) {
                        saveBook.add(i);
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    }
                }
            }
            if (count != 0) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Nhập chỉ số của bút chì bạn muốn sửa: ");
                int index = Integer.parseInt(sc.nextLine());
                pencil selected = (pencil) saveBook.get(index - 1);
                int globalIndex = items.indexOf(selected);
                if (globalIndex == -1) {
                    System.out.println("Lỗi: không tìm thấy bút chì trong danh sách chính.");
                    return;
                }
                System.out.printf("Nhập tên mới (Enter để giữ nguyên: %s): ", selected.getName());
                String name = sc.nextLine();
                if (!name.isEmpty()) selected.setName(name);
                System.out.printf("Nhập giá mới (Enter để giữ nguyên: %d): ", (int) selected.getPrice());
                String priceStr = sc.nextLine();
                if (!priceStr.isEmpty()) selected.setPrice(Double.parseDouble(priceStr));
                System.out.printf("Nhập thương hiệu mới (Enter để giữ nguyên: %s): ", selected.getBrand());
                String brand = sc.nextLine();
                if (!brand.isEmpty()) selected.setBrand(brand);
                System.out.printf("Nhập màu sắc mới (Enter để giữ nguyên: %s): ", selected.getColor());
                String color = sc.nextLine();
                if (!color.isEmpty()) selected.setColor(color);
                System.out.printf("Nhập chất liệu mới (Enter để giữ nguyên: %s): ", selected.getMaterial());
                String material = sc.nextLine();
                if (!material.isEmpty()) selected.setColor(material);
                System.out.printf("Nhập độ cứng mới (Enter để giữ nguyên: %s): ", selected.getString());
                String string = sc.nextLine();
                if (!string.isEmpty()) selected.setString(string);
                System.out.println("Đã cập nhật bút chì.");
            } else if (count == 0) {
                System.out.println("Không tìm được bút chì nào !");
            }
        }
    }
    public static void findPencil(String feature) {
        int count = 0;
        for (item i : items) {
                if (i instanceof pencil) {
                    if (feature.equals(((pencil) i).getName())) {
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    } else if (feature.equals(((pencil) i).getColor())) {
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    } else if (feature.equals(((pencil) i).getMaterial())) {
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    } else if (feature.equals(((pencil) i).getString())) {
                        count++;
                        System.out.println("------");
                        System.out.printf("Bút chì thứ: %d\n", count);
                        System.out.printf("Tên vở ghi: %s\n", i.getName());
                        System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                        System.out.printf("Thương hiệu: %s\n", i.getBrand());
                        System.out.printf("Màu sắc: %s\n", ((pencil) i).getColor());
                        System.out.printf("Độ cứng: %s\n", ((pencil) i).getString());
                        System.out.println("------");
                    }
                }
        }
    }

    // Thao tac but muc
    public static void insertPen(pen pen) {
        items.add(pen);
    }
    public static void showFeaturePen(String feature) {
        ArrayList<item> saveBook = new ArrayList<>();
        int count = 0;
        for (item i : items) {
            if (i instanceof pen) {
                if (feature.equals(((pen) i).getName())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pen) i).getColor());
                    System.out.printf("Chất liệu: %s\n", ((pen) i).getMaterial());
                    System.out.printf("Loại mực: %s\n", ((pen) i).getTypeInk());
                    System.out.printf("Độ mịn: %s\n", ((pen) i).getSmooth());
                    System.out.println("------");
                } else if (feature.equals(((pencil) i).getBrand())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pen) i).getColor());
                    System.out.printf("Chất liệu: %s\n", ((pen) i).getMaterial());
                    System.out.printf("Loại mực: %s\n", ((pen) i).getTypeInk());
                    System.out.printf("Độ mịn: %s\n", ((pen) i).getSmooth());
                    System.out.println("------");
                } else if (feature.equals(((pencil) i).getMaterial())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pen) i).getColor());
                    System.out.printf("Chất liệu: %s\n", ((pen) i).getMaterial());
                    System.out.printf("Loại mực: %s\n", ((pen) i).getTypeInk());
                    System.out.printf("Độ mịn: %s\n", ((pen) i).getSmooth());
                    System.out.println("------");
                } else if (feature.equals(((pen) i).getTypeInk())) {
                    saveBook.add(i);
                    count++;
                    System.out.println("------");
                    System.out.printf("Bút chì thứ: %d\n", count);
                    System.out.printf("Tên vở ghi: %s\n", i.getName());
                    System.out.printf("Giá bán: %d\n", (int) i.getPrice());
                    System.out.printf("Thương hiệu: %s\n", i.getBrand());
                    System.out.printf("Màu sắc: %s\n", ((pen) i).getColor());
                    System.out.printf("Chất liệu: %s\n", ((pen) i).getMaterial());
                    System.out.printf("Loại mực: %s\n", ((pen) i).getTypeInk());
                    System.out.printf("Độ mịn: %s\n", ((pen) i).getSmooth());
                    System.out.println("------");
                }
            }
        }
        if (count != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập chỉ số của bút mực bạn muốn xóa: ");
            int index = Integer.parseInt(sc.nextLine());
            items.remove(saveBook.get(index - 1));
        } else if (count == 0) {
            System.out.println("Không tìm được bút mực nào !");
        }
    }
}
