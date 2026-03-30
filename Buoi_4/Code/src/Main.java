import Permit.adminManager;
import Permit.guestManager;

public class Main {
    static void main(String[] args) {
        adminManager admin = new adminManager();
        guestManager guest = new guestManager();
        while(true){
            login.Out();
            boolean check = login.checkAccount();
            if(check){
                admin.control();
            }
            else{
                guest.control();
            }
        }
    }
}