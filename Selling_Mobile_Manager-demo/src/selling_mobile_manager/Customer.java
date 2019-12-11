
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Customer extends Person {

    static ArrayList<Customer> ListCustomer = new ArrayList<Customer>();

    public Customer() {

    }

    public Customer(String name, Date birthday, String address, int phonenumber) {
        super(name, birthday, address, phonenumber);
    }
    
    public String toString(){
        return "          "+getName()+"          "+getBirthday()+"          "+getAddress()+"          "+getPhonenumber();
    }
    
    public static void printInvoiceHeader() {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %s\n","ID", "NAME","BIRTHDAY","ADDRESS","PHONENUMBER");
    }
    
    public void customerInfor() throws ParseException {
            System.out.printf("Enter name's customer: ");
            String name = new Scanner(System.in).nextLine();
            System.out.printf("Enter the birthday: ");
            String bod1 = new Scanner(System.in).nextLine();
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date d1 = df.parse(bod1);
            df.format(d1);
            System.out.printf("Enter your e_Address: ");
            String address = new Scanner(System.in).nextLine();
            System.out.printf("Enter your e_Phonenumber: ");
            int phone = new Scanner(System.in).nextInt();
            ListCustomer.add(new Customer(name, d1, address, phone));
    }

    public void buy() {

    }

    public void pay() {

    }

    void updateCustomer(ArrayList<Customer> ListCustomer) {
        System.out.printf("Enter position number you want change: ");
        int id = new Scanner(System.in).nextInt();
        System.out.printf("Enter value user want change: ");
        String name = new Scanner(System.in).nextLine();
        Customer cus = new Customer();
        for (int i = 0; i < cus.ListCustomer.size(); i++) {
            if (cus.ListCustomer.get(i).getId() == id) {
                cus.ListCustomer.get(i).setName(name);
            }
        }
    }
    public void displayCustomer(ArrayList<Customer> ListCustomerr){
        int id=0;
        for (int i = 0; i < ListCustomer.size(); i++) {
            id = id + 1;
            System.out.print("ID" + id);    
            System.out.println(ListCustomer.get(i));
		}
        }
    }

