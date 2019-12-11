
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.text.ParseException;
import java.util.Scanner;
import static selling_mobile_manager.Customer.ListCustomer;
import static selling_mobile_manager.Product.ListProduct;


/**
 *
 * @author quyen.tran
 */
public class MainCus {
    public void back() throws ParseException, selling_mobile_manager.ParseException{
        System.out.println("Do you want to continute: ");
        System.out.println("1. yes");
        System.out.println("2. no");
        System.out.println("Chose number: ");
        int x = new Scanner(System.in).nextInt();
            switch (x) {
            case 1:
                menuCus();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void menu(){
        System.out.printf("=============MENU=================\n");
        System.out.printf("What field do you belong to?\n");
        System.out.printf("1. Enter informaton customer \n");
        System.out.printf("2. View Product\n");
        System.out.printf("3. Buy product\n");
        System.out.printf("4. Update data\n");
    }
    
    public void menuCus() throws ParseException, selling_mobile_manager.ParseException {
        menu();
        System.out.printf("Chose number: ");
        Customer cus = new Customer();
        int x = new Scanner(System.in).nextInt();
        switch (x) {
                case 1: 
                    try {
                        cus.customerInfor();
                        cus.displayCustomer(ListCustomer);
                        
                    } catch (Exception e) {
                        System.err.println("Arithmetic Exception occurs!");
                    }
                   back();
                    break;
                case 2:
                    try {
                        Product pro = new Product();
                        pro.viewProduct();
                        back();
                    } catch (Exception e) {
                        System.err.println("Arithmetic Exception occurs!");
                    }
                   back();
                    break;
                case 3:
                    Salesman sale = new Salesman();
                    sale.viewBill();
                    break;
                case 4: 
                    cus.updateCustomer(ListCustomer);
                    cus.displayCustomer(ListCustomer);
                    break;
                    
    }
    }
}

