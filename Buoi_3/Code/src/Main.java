import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Print print = new Print();
        CheckInput checkInput = new CheckInput();
        Scanner sc = new Scanner(System.in);
        while (true) {
            print.getRole();
            String account = sc.nextLine();
            boolean adminAccepted = false, customerAccepted = false;;
            if(checkInput.checkAccount_admin(account)){
                print.getPassword();
                String password = sc.nextLine();
                if(checkInput.checkAccount_admin(password)){
                    adminAccepted = true;
                }
                else{
                    System.out.println("\u001B[34m" + "Tài khoản và mật khẩu không chính xác");
                }
            }
            if(adminAccepted){
                while(true){
                    print.permitManager();
                    int index = Integer.parseInt(sc.nextLine());
                    if(index == 6) break;
                    else if(index == 1) print.numOfBooks();
                    else if(index == 2) print.deleteBook();
                    else if(index == 3) print.updateBook();
                    else if(index == 5) print.xem_sach();
                    else {
                        customerAccepted = true;
                        break;
                    }
                }
            }
            if(customerAccepted || !adminAccepted){
                while(true){
                    print.permitCustomer();
                    int index = Integer.parseInt(sc.nextLine());
                    if (index == 3) break;
                    else if (index == 1) print.findBook();
                    else print.xem_sach();
                }
            }
            break;
        }
    }

}