
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Login {

    static ArrayList<User> accUser = new ArrayList<User>();
    static ArrayList<Admin> accAdmin = new ArrayList<Admin>();
    
    public static void enterAccount() throws ParseException, selling_mobile_manager.ParseException  {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================== WELLCOME TO LOGIN ========================================\n\n");
        System.out.println("Enter accout:");
        String name = input.nextLine();
        System.out.println("Enter password:");
        String pass = input.nextLine();
        if (checkPass(name, pass) == 1) {
            MainCus menu = new MainCus();
            menu.menuCus();
        } else if (checkPass(name, pass) == 2) {
            MainAd menu = new MainAd();
            menu.chose();
        } else {
            System.out.println("Password or Account uncorrect!");
            enterAccount();
        }
    }
    
     public static int checkPass(String name, String pass)  {
        User u = new User("user", "pass");
        Admin a = new Admin("admin", "pass");
        accUser.add(u);
        accAdmin.add(a);
        if (name.equals(u.getUser()) && pass.equals(u.getPass())) {
            return 1;
        } else if (name.equals(a.getAdmin()) && pass.equals(a.getPass())) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws ParseException, selling_mobile_manager.ParseException {
        enterAccount();
    }

}

   
