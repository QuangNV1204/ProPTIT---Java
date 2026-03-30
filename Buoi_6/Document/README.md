<center>

# BUỔI 6: INTERFACE VÀ TRỪU TƯỢNG
</center>

## Nội dung tài liệu
1. **Interface là gì? Abstract class là gì?**
2. **So sánh Interface và Abstract class**
3. **Khi nào dùng Interface? Khi nào dùng Abstract class?**
4. **Tính trừu tượng**
5. **Enum và cách sử dụng**

## I. Abstract class là gì?
**A. Abstract là gì ?**
- **Abstract class (lớp trừu tượng)** là một lớp không thể tạo đối tượng trực tiếp (tức khởi tảo thông qua từ khóa **new**), được dùng làm lớp cơ sở cho các lớp con.
- Các lớp con kế thừa (extends) phải triển khai các phương thức abtract (phương thức trừu tượng).
- Nó có thể chứa:
    - Các phương thức trừu tượng (chưa có nội dung, chỉ khai báo),
    - Các phương thức bình thường (có nội dung cụ thể),
    - Các thuộc tính (biến).

**Ví dụ:**
```java
public abstract class Animal {
    // Phương thức trừu tượng (không có thân)
    public abstract void makeSound();

    // Phương thức bình thường
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
```

Lớp con kế thừa phải override (ghi đè) tất cả các phương thức abstract, trừ khi lớp con cũng là abstract. Tức là:
- Nếu lớp cha có phương thức abstract (không có thân), thì lớp con bắt buộc phải triển khai (override) phương thức đó để định nghĩa rõ hành vi.
- Nhưng nếu lớp con đó cũng được khai báo là abstract class, thì nó không cần phải override ngay các phương thức abstract đó, vì lớp con abstract có thể vẫn để lại cho lớp con tiếp theo xử lý.

```java
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
```

**B. Một số đặc điểm**
1. **Abstract Class không thể tạo đối tượng trực tiếp**

```java
Animal a = new Animal("Buddy");  // Lỗi biên dịch!
```
- vì Animal là abstract, nó chưa hoàn chỉnh, không thể khởi tạo đối tượng trực tiếp.

2. **Abstract Class có thể có constructor**
- Mặc dù không tạo đối tượng trực tiếp từ abstract class, bạn vẫn có thể khai báo constructor trong abstract class.
- Constructor này sẽ được gọi khi một đối tượng của lớp con (non-abstract) được tạo ra.

```java
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Constructor của Animal được gọi, name = " + name);
    }

    abstract void makeSound();
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);  // Gọi constructor của lớp cha (Animal)
        System.out.println("Constructor của Dog được gọi");
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");  // Tạo đối tượng Dog
        dog.makeSound();
    }
}
```

3. **Một lớp có thể chỉ định là abstract mà không có phương thức abstract nào**

**Ví dụ:**
```java
abstract class A {
    public void hello() {
        System.out.println("Hello from A");
    }
}
```

- Lớp A ở trên là hợp lệ. Không có phương thức abstract nhưng vẫn là abstract class
- Lí do cho việc khai báo abstract mà không có phương thức abstract thường là:
    - Lớp đó được thiết kế để không cho phép tạo trực tiếp, dù đã có đầy đủ các phương thức. Tức là nó chỉ dùng làm lớp cha để kế thừa.
    - Ép buộc thiết kế hướng kế thừa (template, strategy, factory pattern...)
    - Làm rõ ý đồ lập trình: "lớp này là nền tảng, không phải để dùng trực tiếp"

4. **Abstract class giúp thiết kế theo hướng OOP, tạo ra khuôn mẫu bắt buộc các lớp con phải triển khai.**
- Khi bạn khai báo một hoặc nhiều phương thức là abstract, bạn đang nói: -> “Mọi lớp kế thừa từ lớp này phải tự định nghĩa hành vi cụ thể cho những phương thức đó.”
- Điều này giúp đảm bảo tính nhất quán và kiểm soát thiết kế trong các hệ thống lớn.

```java
abstract class Animal {
    // Phương thức bắt buộc lớp con phải định nghĩa
    abstract void makeSound();

    // Hành vi chung có thể dùng lại
    void breathe() {
        System.out.println("Breathing...");
    }
}
```

```java
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```

- Lớp Animal là khuôn mẫu: mọi "con vật" đều phải biết kêu (makeSound()), nhưng cụ thể kêu thế nào là do từng loài quyết định.
- breathe() là hành vi chung → lớp cha định nghĩa sẵn → lớp con không cần viết lại.

**Kết luận ngắn gọn:** Abstract class giống như “bản thiết kế khung” của một nhóm đối tượng — nó nói “bạn phải làm gì”, nhưng không nói “làm như thế nào”.

## II. Interface là gì ?
Trong Java, interface là một kiểu dữ liệu đặc biệt dùng để khai báo một tập hợp các phương thức trừu tượng (abstract methods) mà một lớp (class) có thể cam kết thực hiện.

**Ví dụ:**
```java
public interface Animal {
    void makeSound();  // phương thức trừu tượng
}
```

Một class muốn triển khai (implement) một interface phải override tất cả các phương thức bên trong interface đó.
```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

1. **Một số đặc điểm**
- Các phương thức trong interface mặc định là public abstract (kể cả nếu không ghi rõ).
- Các biến trong interface mặc định là public static final (hằng số).
- Một lớp có thể **implement nhiều interface** → hỗ trợ đa kế thừa kiểu **interface**.

```java
interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Duck implements Flyable, Swimable {
    public void fly() { System.out.println("Duck flies"); }
    public void swim() { System.out.println("Duck swims"); }
}
```

2. **Những thay đổi của interface trong các phiên bản Java mới**

- **Phương thức mặc định (default) (có thân hàm trong interface)**
    - Giúp cung cấp logic mặc định, không bắt buộc class triển khai phải override.
    - Cho phép thêm chức năng mới vào interface mà không làm hỏng các class cũ đang implements interface đó.

```java
public interface PaymentMethod {
    void pay(double amount);  // phương thức chính (bắt buộc override)

    // default method
    default void printReceipt(double amount) {
        System.out.println("Đã thanh toán số tiền: " + amount);
        System.out.println("Hẹn gặp lại quý khách!");
    }
}
```

- **Lưu ý về xung đột default method** Nếu một class implements nhiều interface mà các interface đó có cùng tên default method, bạn phải override trong class.
```java
interface A {
    default void hello() { System.out.println("Hello from A"); }
}

interface B {
    default void hello() { System.out.println("Hello from B"); }
}

class C implements A, B {
    @Override
    public void hello() {
        // Bắt buộc ghi đè để giải quyết xung đột
        A.super.hello(); // hoặc B.super.hello();
    }
}
```

- **Phương thức tĩnh (static):**
  - Trong Java, từ Java 8 trở đi, bạn có thể khai báo phương thức static trong interface.
  - Phương thức static trong interface chỉ được gọi qua chính tên của interface

```java
public interface PaymentUtils {
    static void printSupportHotline() {
        System.out.println("Gọi 1800-9999 để được hỗ trợ thanh toán.");
    }
}
```

Gọi method static từ interface

```java
public class Main {
    public static void main(String[] args) {
        PaymentUtils.printSupportHotline(); // Gọi đúng
    }
}
```

- **Private methods trong interface:**
    - Cho phép viết private method dùng trong nội bộ default và static, giúp tái sử dụng logic và làm code gọn gàng.
    - Không thể gọi từ bên ngoài, chỉ dùng nội bộ trong interface

```java
interface PaymentMethod {
    default void validate() {
        log("Validating...");
    }

    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}
```

## III. So sánh Interface và Abstract class.

| Tiêu chí                             | Abstract class                                         | Interface                                                                      |
| ------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------------------------------ |
| Khai báo                             | `abstract class`                                       | `interface`                                                                    |
| Hỗ trợ kế thừa (inheritance)         | Chỉ được kế thừa 1 abstract class (single inheritance) | Có thể `implements` nhiều interface                                            |
| Hỗ trợ đa kế thừa                    |  Không                                                |  Không (đạt được mục đích đa kế thừa thông qua implement lại nhiều interface) |
| Có thể chứa phương thức abstract?    |  Có                                                   |  Có                                                                           |
| Có thể chứa phương thức có thân hàm? |  Có (normal method)                                   |  Có (`default`, `static` – Java 8+)                                           |
| Có thể chứa private method?          |  Có                                                   |  Có (từ Java 9+)                                                              |
| Có thể chứa biến (field)?            |  Có (instance + `static final`)                       |  `public static final` (hằng số)                                              |
| Constructor                          |  Có thể có constructor                                |  Không thể có constructor                                                     |
| Access modifier                      | `public`, `protected`, `private`                       | `public`, `private` (Java 9+), `default`, `static`                             |

## IV. Khi nào dùng Interface? Khi nào dùng Abstract class?
1. **Khi nào dùng Interface?**
- **Định nghĩa hành vi cho các lớp không liên quan:** Khi bạn muốn các lớp khác nhau (không cùng họ hàng) có chung một khả năng nào đó.
- **Đa kế thừa**: Một lớp có thể thực thi (implement) nhiều Interface cùng lúc, nhưng chỉ có thể kế thừa một lớp cha.
- **Hệ thống lỏng lẻo (Loose Coupling):** Khi bạn muốn tách biệt "phần định nghĩa" và "phần thực hiện". Bạn chỉ quan tâm đối tượng đó có thể làm gì (Can-do), thay vì nó là gì (Is-a).

2. **Khi nào dùng Abstract Class?**
- **Chia sẻ mã nguồn (Code Reuse)**: Khi các lớp con có rất nhiều đặc điểm và hành vi giống hệt nhau. Bạn viết code một lần ở lớp cha để các lớp con dùng lại.
- **Có trạng thái (State)**: Nếu bạn cần lưu trữ các biến (fields) không phải là hằng số (ví dụ: protected String name;), bạn bắt buộc phải dùng Abstract class.
- **Mối quan hệ "Là một" (Is-a)**: Khi các lớp con thực sự là một phiên bản cụ thể của lớp cha.
- **Định nghĩa khung (Template Method)**: Khi bạn muốn định nghĩa một quy trình chung, nhưng để trống một vài bước cho lớp con tự điền vào.

## V. Tính trừu tượng
- Tính trừu tượng trong Java là quá trình ẩn đi các chi tiết triển khai phức tạp và chỉ hiển thị các chức năng cần thiết cho người dùng hoặc lập trình viên khác.
- Nói cách khác, nó cho phép bạn tập trung vào "cái gì" thay vì "làm thế nào". Trong lập trình hướng đối tượng, tính trừu tượng giúp giảm độ phức tạp của hệ thống bằng cách tách biệt giao diện (interface) và triển khai (implementation).
**Ví dụ:** Ví dụ, khi bạn sử dụng một chiếc xe hơi, bạn chỉ cần biết cách đạp ga, phanh, hoặc xoay vô-lăng mà không cần hiểu chi tiết về động cơ hay hệ thống truyền động.
1. **Lớp Trừu Tượng (Abstract Class)**
- Lớp trừu tượng là một lớp được khai báo với từ khóa abstract. Nó có thể chứa cả các phương thức trừu tượng (không có thân hàm) và phương thức thông thường (có thân hàm). Lớp này không thể khởi tạo trực tiếp mà chỉ có thể được kế thừa bởi các lớp con.

```java
abstract class Animal {
    abstract void makeSound(); // Phương thức trừu tượng
    void sleep() { // Phương thức thông thường
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}
```

- Trong ví dụ trên, lớp Animal là một lớp trừu tượng định nghĩa hành vi chung (makeSound) mà các lớp con như Dog phải triển khai.

2. **Giao Diện (Interface)**
- Giao diện trong Java là một tập hợp các phương thức trừu tượng và hằng số. Từ Java 8, giao diện còn hỗ trợ các phương thức mặc định (default) và phương thức tĩnh (static). Các lớp triển khai giao diện phải cung cấp thân hàm cho tất cả các phương thức trừu tượng.

```java
interface Vehicle {
    void start(); // Phương thức trừu tượng
    default void stop() { // Phương thức mặc định
        System.out.println("Vehicle stopped.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }
}
```

3. **Lợi ích của Tính Trừu Tượng Trong Java**
- Giảm độ phức tạp: Bằng cách ẩn các chi tiết triển khai, lập trình viên có thể tập trung vào logic chính của chương trình.
- Tăng tính tái sử dụng: Lớp trừu tượng và giao diện cho phép định nghĩa các hành vi chung, dễ dàng tái sử dụng trong nhiều lớp khác nhau.
- Tăng tính bảo trì: Mã nguồn được tổ chức tốt hơn, dễ dàng cập nhật hoặc sửa đổi mà không ảnh hưởng đến các phần khác của hệ thống.
- Hỗ trợ đa hình (Polymorphism): Tính trừu tượng cho phép sử dụng các tham chiếu của lớp cha hoặc giao diện để gọi các phương thức của lớp con, tăng tính linh hoạt.

## VI. Enum và cách sử dụng
**A. Enum**
- Enum là một tập hợp các giá trị có thể có của 1 thuộc tính, chẳng hạn Giới tính thì có thể Nam, Nữ (nay thì có thêm Gay, Less), hay tình trạng hôn nhân Status của 1 người thì có thể là Single, Engaged, Complicated, Married. Kiểu dữ liệu mặc định của Enum là int, phần tử đầu tiên có giá trị là 0 và các phần tử tiếp theo có giá trị mặc định tăng lên 1.

**Công dụng của Enum**
```java
public enum MaritalStatus 
{
    Single, Engaged, Complicated, Married
}
```

- Như đoạn code khai báo ở trên thì tình trạng hôn nhân của 1 người chỉ có thể là 1 trong 4: độc thân, đã đính hôn, còn phức tạp hay đã cưới. Giá trị đại diện cho **Single là 0, Engaged là 1, Complicated là 2 và Married là 3**. Đó là giá trị mặc định, còn tất nhiên là chúng ta có thể tự define giá trị cho mỗi Status

```java
public enum MaritalStatus 
{
    Single = 1 , Engaged = 3, Complicated = 5, Married = 10
}
```
**Tác dụng của Enum có thể kể đến:**
- Giới hạn các giá trị mà 1 thuộc tính có thể có (như trên thì MaritalStatus chỉ có 4 giá trị khác nhau)
- Enum giúp chúng ta dễ dàng nhận ra các giá trị có thể có của 1 thuộc tính, giúp dễ dàng đọc hiểu code

**B. Cách sử dụng**
1. **Định nghĩa Enum:**
- Sử dụng từ khóa enum (trong C#, Java, TypeScript).
- Liệt kê các giá trị (thành viên) trong cặp ngoặc nhọn {}.
**Ví dụ:**
```java
public enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
```
- Lưu ý: Các giá trị mặc định bắt đầu từ 0 và tăng dần (ví dụ: SUNDAY = 0, MONDAY = 1).

2. **Khai báo biến và Gán giá trị:**
- Tạo một biến có kiểu là tên enum vừa định nghĩa.
- Gán giá trị cho biến phải nằm trong tập hợp các thành viên đã định nghĩa.

```java
DayOfWeek today = DayOfWeek.MONDAY;
```

3. **Sử dụng**
- Dùng biến enum trong điều kiện `if/else`, `switch` để xử lý logic
**Ví dụ:**
```java
if (today == DayOfWeek.MONDAY) {
    System.out.println("Hôm nay là thứ Hai!");
}
```
- Lợi ích:
    - **Code rõ ràng:** Dễ hiểu hơn so với dùng magic numbers.
    - **An toàn:** Hạn chế lỗi do nhập sai giá trị, chỉ cho phép các giá trị hợp lệ.
    - **Bảo trì dễ dàng**: Nếu có thay đổi, chỉ cần sửa trong định nghĩa enum. 

- Các trường hợp dùng Enum:
    - Các ngày trong tuần, tháng trong năm.
    - Trạng thái (ví dụ: `PENDING`, `PROCESSING`, `COMPLETED`).
    - Mức độ (ví dụ: `LOW`, `MEDIUM`, `HIGH`).
    - Loại (ví dụ: `ADMIN`, `USER`, `GUEST`). 