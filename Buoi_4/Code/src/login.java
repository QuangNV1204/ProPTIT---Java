import java.util.Scanner;

public class login {
    public static void Out(){
        System.out.println("Chọn một trong những lệnh sau");
        System.out.println("1: Đăng nhập admin");
        System.out.println("2: Đăng nhập khách");
        System.out.print("Chọn lệnh: ");
    }
    public static boolean checkAccount(){
        Scanner sc = new Scanner(System.in);
        String tenAdmin = "Admin";
        String matKhau = "admin";
        int index = Integer.parseInt(sc.nextLine());
        if(index == 1){
            boolean check = false;
            System.out.printf("Nhập tài khoản: ");
            String account = sc.nextLine();
            if(account.equalsIgnoreCase(tenAdmin)){
                check = true;
            }
            else{
                System.out.println("Nhập sai tài khỏan admin tự động chuyển qua khách");
            }
            if(check == true){
                System.out.println("Bạn có 2 lần nhập mật khẩu");
                boolean check1 = false;
                for(int i = 1; i <= 2; ++i){
                    System.out.printf("Nhập mật khẩu lần thứ %d: ", i);
                    String password = sc.nextLine();
                    if(password.equalsIgnoreCase(matKhau)){
                        check1 = true;
                        System.out.println("Đăng nhập admin thành công");
                        break;
                    }
                    else{
                        System.out.println();
                    }
                }
                if(check1 == true){
                    return true;
                }
            }
        }
        else{
            System.out.printf("Nhập tài khoản: ");
            String account = sc.nextLine();
            System.out.println("Đăng nhập khách thành công");
        }
        return false;
    }
}
