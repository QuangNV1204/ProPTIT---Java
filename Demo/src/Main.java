import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dia_chi = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            int toan =  Integer.parseInt(sc.nextLine());
            int van = Integer.parseInt(sc.nextLine());
            int anh = Integer.parseInt(sc.nextLine());
            Student st = new Student(name,dia_chi,age,toan,van,anh);
            students[i] = st;
        }
        for(int i = 0; i < n; i++) {
            System.out.println(students[i].name);
            double diem = Manager.diemTB(students[i]);
            System.out.println(diem);
            System.out.println(Manager.hocLuc(diem));
        }
    }
}