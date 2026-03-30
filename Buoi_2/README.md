<center>

# Tìm hiểu sâu về OBJECT
Người biên soạn: **Nguyễn Văn Quang**
</center>

## Mục lục

---

- I. Object là gì ?
- II. Object được lưu thế nào trong Java
- III. Wrapper class
- IV. Auto boxing / Auto unboxing
- VI. String và StringBuilder trong Java
- VII. Về equals và hashcode, toán tử ==
- VIII. Cách Java truyền tham số, pass by value, tại sao pass by value mà String lại thay đổi được
- IX. Các khái niệm cơ bản về Garbage Collector

---

## I. Object là gì ?
- **Object (đối tượng)** trong **Java** là một thể hiện (instance) của **class**, được tạo ra từ khuôn mẫu của **class**.
- Mỗi **object** có trạng thái (state), hành vi (behavior) và danh tính (identity) riêng.

## II. Object được lưu thế nào trong Java ?

1. **Bộ nhớ của JVM gồm 5 vùng chính**

| **Vùng nhớ**                     | **Vai trò**                                                                                           |
| -------------------------------- | ----------------------------------------------------------------------------------------------------- |
| **Method Area (hoặc MetaSpace)** | Lưu thông tin **class, method, biến tĩnh (static)**, và **metadata** của chương trình.                |
| **Heap**                         | Lưu **object** và **instance variables** (biến thuộc object). Đây là vùng lớn nhất.                   |
| **Stack**                        | Lưu **biến cục bộ, tham chiếu** (reference) đến object trong heap, và **lời gọi hàm (method calls)**. |
| **PC Register**                  | Giữ địa chỉ lệnh hiện tại mà thread đang thực thi.                                                    |
| **Native Method Stack**          | Dành cho các phương thức viết bằng ngôn ngữ khác (C/C++).                                             |

2. **Cách object được lưu trong bộ nhớ**
**Cho ví dụ:**
```java
class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Quang";
        s.age = 19;
    }
}
```
**Quá trình lưu:**
1. *Khi chạy chương trình*
- JVM nạp thông tin lớp `student` vào **Method Area**
    -> Bao gồm tên class, kiểu dữ liệu, và các phương thức
2. **Khi tạo đối tượng bằng** `new Student()`
- Một vùng nhớ mới được cấp phát trong **Heap** để lưu **object Student** (gồm các trường `name` và `age`)
- Object đó có địa chỉ (ví dụ `abcd1xyz` trong **Heap**)
3. Biến `s` trong **Stack**
- Không chứa **object** thật, mà chỉ chứa **tham chiếu (reference)** trỏ tới vùng nhớ của object trong **Heap**.

**Minh họa:**
```pgsql
+---------------------------+
| Stack         |
| ------------- |
| s  ─────────┐ |
| │             |
+--------------│-------------+
               ▼
+---------------------------+
| Heap            |
| --------------- |
| Object(Student) |
| name = "Quang"  |
| age  = 20       |
+---------------------------+
```

## III. Wrapper class
1. **Định nghĩa Wrapper class**
- Lớp Wrapper trong Java là các lớp được sử dụng để "bọc" (wrap) các kiểu dữ liệu nguyên thủy (primitive types) như int, double, char, v.v., thành các đối tượng.
- Điều này cần thiết vì trong một số trường hợp, Java yêu cầu sử dụng các đối tượng thay vì kiểu dữ liệu nguyên thủy

2. **Vai trò của Wrapper class**
- Chuyển đổi kiểu dữ liệu: Lớp Wrapper cung cấp các phương thức để chuyển đổi giữa kiểu nguyên thủy và đối tượng, hoặc giữa các định dạng như chuỗi (String) và số.
- Cung cấp phương thức tiện ích: Các lớp Wrapper như Integer hoặc Double có các phương thức hỗ trợ như parseInt(), toString(), giúp xử lý dữ liệu dễ dàng hơn.

## IV. Auto boxing / Auto unboxing
1. **Auto boxing**
- Autoboxing là quá trình tự động chuyển đổi từ kiểu dữ liệu nguyên thủy sang lớp Wrapper tương ứng.
- Quá trình này được Java thực hiện ngầm, giúp lập trình viên tiết kiệm thời gian và mã lệnh.
**Ví dụ về Auto Boxing:**
```java
Integer number = 10; // Autoboxing: int được tự động chuyển thành Integer
ArrayList<Integer> list = new ArrayList<>();
list.add(5); // Autoboxing: 5 (int) được chuyển thành Integer
```
-> Trong ví dụ trên, giá trị 10 kiểu int được tự động chuyển thành đối tượng Integer mà không cần gọi phương thức như Integer.valueOf(10).
- Khi nào **Auto boxing** xảy ra ?
    - Khi gán một kiểu nguyên thủy cho một biến kiểu lớp Wrapper.
    - Khi truyền một kiểu nguyên thủy vào phương thức yêu cầu đối tượng lớp Wrapper.
    - Khi thêm kiểu nguyên thủy vào các Collection như ArrayList, HashMap.
2. **Auto unboxing**
- Ngược lại với Autoboxing, Unboxing là quá trình tự động chuyển đổi từ đối tượng lớp Wrapper về kiểu dữ liệu nguyên thủy tương ứng.
**Ví dụ về Auto Unboxing**
```java
Integer number = new Integer(20);
int value = number; // Unboxing: Integer được chuyển thành int
```
-> Trong ví dụ trên, đối tượng Integer được tự động chuyển thành kiểu int mà không cần gọi phương thức như number.intValue().
- Khi nào **Auto Unboxing** xảy ra ?
    - Khi gán một đối tượng lớp Wrapper cho một biến kiểu nguyên thủy.
    - Khi thực hiện các phép toán số học với đối tượng lớp Wrapper.
    - Khi truyền đối tượng lớp Wrapper vào phương thức yêu cầu kiểu nguyên thủy.
**Dưới đây là một chương trình minh họa cả Autoboxing và Unboxing:**
```java
import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing
        Integer num = 100; // int -> Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(200); // int -> Integer

        // Unboxing
        int value = num; // Integer -> int
        int sum = numbers.get(0) + 50; // Integer -> int, sau đó thực hiện phép cộng

        System.out.println("Giá trị của num: " + value);
        System.out.println("Tổng: " + sum);
    }
}
```
**Kết quả:**
```java
Giá trị của num: 100
Tổng: 250
```

3. **Ưu điểm và nhược điểm của Autoboxing và Unboxing**
- **Ưu điểm**
    - **Tiện lợi:** Autoboxing và Unboxing giúp giảm mã lệnh thủ công, tăng tính dễ đọc.
    - **Tương thích với Collection:** Cho phép sử dụng kiểu nguyên thủy trong các cấu trúc dữ liệu chỉ chấp nhận đối tượng.
    - **Tăng tính linh hoạt:** Dễ dàng chuyển đổi giữa kiểu nguyên thủy và đối tượng.
- **Nhược điểm**
    - **Hiệu suất:** Autoboxing và Unboxing có thể làm giảm hiệu suất vì tạo ra các đối tượng mới.
    - **Nguy cơ NullPointerException:** Khi Unboxing một đối tượng lớp Wrapper có giá trị null, chương trình sẽ gặp lỗi.
**Ví dụ lỗi NullPointerException:**
```java
Integer number = null;
int value = number; // Gây ra NullPointerException
```

## V. String
1. **Định nghĩa về String**
- `String` trong Java là một lớp (class) nằm trong gói `java.lang`, dùng để lưu trữ và xử lý chuỗi ký tự (text).
- Khác với nhiều ngôn ngữ khác, trong Java, `String` **không phải là kiểu dữ liệu nguyên thủy**, mà là một **đối tượng (object)**.

2. **Tính chất quan trọng: Bất biến**
- Một khi `String` đã được tạo, nội dung của nó không thể thay đổi.
- Mọi thao tác **thay đổi** trên String thực ra là **tạo ra một đối tượng String mới** trong bộ nhớ.
**Ví dụ:**
```java
String s = "Hello";
s.concat(" World");
System.out.println(s);
```
**Kết quả:**
```nginx
Hello
```
-> Vì `concat()` **không thay đổi chuỗi gốc**, mà là trả về **một chuỗi mới**
- Nếu muốn dùng chuỗi mới, phải gán lại:
```java
s = s.concat(" World");
```

3. **Cách tạo ra String**
- Cách 1: dùng chuỗi kí tự trực tiếp
```java
String s1 = "Hello";
```
→ Chuỗi này được lưu trong String Pool (vùng nhớ đặc biệt trong Heap).
- Cách 2: Dùng từ khóa `new`
```java
String s2 = new String("Hello");
```
→ Chuỗi này luôn được **tạo mới trong Heap, không dùng lại** chuỗi trong String Pool.

## VI. StringBuilder trong Java
1. **Định nghĩa** `StringBuilder`
- `StringBuilder` trong Java là một **lớp dùng để tạo và thao tác với chuỗi có thể thay đổi** (mutable string).
- Nó giúp nối, sửa, xóa, hoặc chèn chuỗi mà không tạo ra đối tượng mới mỗi lần thay đổi — khác với `String`.

2. **So sánh với String**

| **Đặc điểm**                | `String`                                      | `StringBuilder`                                   |
| --------------------------- | --------------------------------------------- | ------------------------------------------------- |
| **Tính chất**               | Bất biến (immutable)                          | Có thể thay đổi (mutable)                         |
| **Hiệu suất khi nối chuỗi** | Chậm (tạo đối tượng mới mỗi lần nối)          | Nhanh (chỉnh sửa trực tiếp trong bộ nhớ)          |
| **Thread-safe**             | Có thể dùng nhiều luồng an toàn (vì bất biến) | Không an toàn khi đa luồng                        |
| **Dùng trong trường hợp**   | Chuỗi cố định, ít thay đổi                    | Chuỗi thay đổi thường xuyên, ví dụ trong vòng lặp |
3. **Cách tạo StringBuilder**
```java
StringBuilder sb = new StringBuilder(); // tạo chuỗi rỗng
StringBuilder sb2 = new StringBuilder("Hello"); // tạo chuỗi ban đầu
```

## VII. equals và hashcode, toán tử ==
1. **equals**
- `.equals()` là phương thức được định nghĩa trong lớp Object, mặc định cũng so sánh theo địa chỉ, **nhưng nhiều lớp override (ghi đè) để so sánh nội dung** (vd: `String`, `Integer`, `List`...).
**Ví dụ:**
```java
String s1 = new String("Hello");
String s2 = new String("Hello");

System.out.println(s1.equals(s2));  // true (vì String override equals để so sánh nội dung)
```
2. **Phương thức** `.hashCode()`
- `.hashCode()` trả về **một số nguyên** biểu diễn vị trí (hash) của object, dùng trong các cấu trúc dữ liệu như `HashMap`, `HashSet`, để tra cứu nhanh.

3. **Toán tử ==**
- Kiểu dữ liệu nguyên thủy: So sánh giá trị
- Đối tượng Object: So sánh địa chỉ vùng nhớ (xem có cùng object không)
**Ví dụ:**
```java
int a = 10, b = 10;
System.out.println(a == b);  // true (vì cùng giá trị 10)

String s1 = new String("Hello");
String s2 = new String("Hello");
System.out.println(s1 == s2);  // false (vì khác vùng nhớ)
```

4. **Tóm tắt nhanh**

| **Cách so sánh** | **Ý nghĩa**                              | **So sánh gì**                                           |
| ---------------- | ---------------------------------------- | -------------------------------------------------------- |
| `==`             | So sánh địa chỉ trong bộ nhớ (reference) | Giống nhau nếu cùng trỏ tới 1 object                     |
| `.equals()`      | So sánh nội dung (value)                 | Giống nhau nếu nội dung object giống nhau                |
| `.hashCode()`    | Trả về mã băm (integer) của object       | Dùng để tối ưu tìm kiếm trong `HashMap`, `HashSet`, v.v. |

## VIII. Cách Java truyền tham số, pass by value, tại sao pass by value mà String lại thay đổi được
- Java chỉ có một cách truyền tham số **Pass by value (truyền theo giá trị).**

1. **"Pass by value"** nghĩa là gì ?
- Khi bạn truyền tham số vào hàm, **Java sao chép giá trị** của biến đó - vì vậy hàm nhận được **là một bản sao**.
**Ví dụ**
```java
public class Main {
    public static void change(int x) {
        x = 10;    // chỉ thay đổi bản sao
    }
    public static void main(String[] args) {
        int a = 5;
        change(a);
        System.out.println(a);  // vẫn là 5
    }
}
```
**Giải thích:**
- `a` giữ giá trị `s`
- Khi gọi `change(a)`, Java sao chép giá trị 5 vào biến `x`.
- `x` thay đổi không ảnh hưởng đến `a`.

2. **"Pass by value" với đối tượng Object**
- Khi truyền object, Java vẫn **pass by value**, nhưng “giá trị” được sao chép ở đây là **giá trị của tham chiếu (reference)** — không phải object thật.
**Ví dụ:**
```java
class Person {
    String name;
}

public class Main {
    public static void change(Person p) {
        p.name = "Lan";   // thay đổi qua tham chiếu
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Quang";

        change(p1);
        System.out.println(p1.name);  // in ra "Lan"
    }
}
```
**Giải thích:**
- `p1` chứa tham chiếu (địa chỉ) của object `Person`.
- Khi gọi `change(p1)`, Java sao chép giá trị tham chiếu vào `p`.
- Cả `p` và `p1` đều trỏ đến cùng object → thay đổi qua `p` làm thay đổi object thật.

3. **Đối với String**
**Ví dụ:**
```java
public class Main {
    public static void change(String s) {
        s = s.concat(" World");
    }

    public static void main(String[] args) {
        String str = "Hello";
        change(str);
        System.out.println(str); // vẫn là "Hello"
    }
}
```
**Giải thích**
- `String` trong Java là **immutable (bất biến)** — nội dung không thể bị thay đổi.
- Khi gọi `change(str)`, giá trị **tham chiếu đến "Hello"** được sao chép vào `s`.
- Khi thực hiện `s.concat(" World")`, Java **tạo một object String mới** `"Hello World"`, và gán s (bản sao) trỏ tới object mới này.
- Biến `str` bên ngoài vẫn trỏ tới `"Hello"` → không bị thay đổi.

## IX. Các khái niệm cơ bản về Garbage Collector
1. **Định nghĩa Garbage Collector**
- **Garbage Collector** trong Java là bộ dọn rác tự động của JVM, có nhiệm vụ giải phóng vùng nhớ (heap) mà các **object không còn được tham chiếu** tới nữa.
**Nói đơn giản:** 
- Khi bạn tạo object bằng `new`, nó nằm trong bộ nhớ heap.
- Khi không còn biến nào trỏ tới object đó → GC sẽ **tự động** xóa nó, giúp tránh rò rỉ bộ nhớ (memory leak).

2. **Java quản lí bộ nhớ như thế nào**
*Bộ nhớ trong JVM được chia làm 2 phần chính*

| Phần      | Mô tả                                                      |
| --------- | ---------------------------------------------------------- |
| **Stack** | Lưu biến cục bộ, tham chiếu, lời gọi hàm (quản lý tự động) |
| **Heap**  | Lưu object, được quản lý bởi Garbage Collector             |

**Ví dụ minh họa:**
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb = new StringBuilder("New object"); // "Hello world" không còn tham chiếu

        // "Hello world" bây giờ là garbage
    }
}
```
-> Ở đây object `"Hello world"` sẽ bị GC dọn vì không còn biến nào trỏ tới nó.

3. **Cách GC hoạt động (tổng quan)**
- Java sử dụng **thuật toán Mark and Sweep (Đánh dấu và quét)**:

| Giai đoạn              | Mô tả                                                         |
| ---------------------- | ------------------------------------------------------------- |
| **Mark (đánh dấu)**    | GC tìm tất cả các object còn được tham chiếu.                 |
| **Sweep (quét)**       | GC xóa các object không còn được tham chiếu khỏi bộ nhớ heap. |
| **Compact (gom mảnh)** | (tuỳ JVM) Gom vùng nhớ trống lại để tránh phân mảnh.          |

4. **Khi nào một object bị thu hồi**
- Không còn biến tham chiếu tới nó
- Không thể truy cập qua bất kỳ “đường dẫn” tham chiếu nào
- Không được giữ lại trong một container hoặc cache đang hoạt động
**Ví dụ**
```java
public class Test {
    static Object ref;

    public static void main(String[] args) {
        Object obj = new Object();
        ref = obj; // vẫn còn tham chiếu
        obj = null; // nhưng ref vẫn giữ, nên chưa bị GC
        ref = null; // bây giờ mới có thể bị GC
    }
}
```