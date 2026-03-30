package Permit;

import Ui.Print;

import java.util.Scanner;

public class guestManager {
    Scanner sc = new Scanner(System.in);
    Print print  = new Print();
    adminManager admin = new adminManager();
    saveItem saveItem = new saveItem();
    public void findItem(){
        print.guestFind();
        int index = Integer.parseInt(sc.nextLine());
        switch (index){
            case 1:
                admin.findBook();
                break;
            case 2:
                admin.findNote();
                break;
            case 3:
                admin.findPencil();
                break;
            default:
                break;
        }
    }
    public void findRandom(){
        System.out.println("Nhập một đặc điểm bất kì về vật phẩm bạn muốn tìm");
        String feature = sc.nextLine();
        saveItem.findBook(feature);
        saveItem.findNote(feature);
        saveItem.findPencil(feature);
    }
    public void control(){
        print.guestOUt();
        int getItem = Integer.parseInt(sc.nextLine());
        while(true){
            boolean Break = false;
            switch (getItem){
                case 1:
                    findItem();
                    break;
                case 2:
                    findRandom();
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
