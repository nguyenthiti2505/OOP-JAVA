/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Supplier extends Person {

    static ArrayList<Supplier> ListSupplier = new ArrayList<Supplier>();

    public Supplier() {

    }
//    public Supplier(int id, String name, Date birthday, String address, int phonenumber) {
//        super(id, name, birthday, address, phonenumber);
//    }

    public Supplier(int id, String name) {
        super(id, name);
    }


    @Override
    public String toString() {

        return "" + getName() + "                      " + getId();

    }

    public void printInvoiceHeader() {
        System.out.printf("%-20s %s\n", "Name", "ID");
    }

    public void supplierInfor() throws ParseException {
        System.out.printf("Enter id: ");
        int id = new Scanner(System.in).nextInt();
        if (checkId(id) == 1) {
            System.out.printf("Enter name's supplier: ");
            String name = new Scanner(System.in).nextLine();
            ListSupplier.add(new Supplier(id, name));
        } else {
            System.out.println("id exist");
        }
    }

    public int checkId(int a) {
        Supplier sup = new Supplier();
        for (int i = 0; i < sup.ListSupplier.size(); i++) {
            if (sup.ListSupplier.get(i).getId() == a) {
                return 0;
            }
        }
        return 1;
    }

    public void deleteSuplier(int id, ArrayList<Supplier> ListSupplier) {

        Supplier sup = new Supplier();
        for (int i = 0; i < sup.ListSupplier.size(); i++) {
            if (sup.ListSupplier.get(i).getId() == id) {
                sup.ListSupplier.remove(i);
            }
        }
    }

    public void updateSuplier(ArrayList<Supplier> ListSupplier) {
        System.out.printf("Enter id: ");
        int id = new Scanner(System.in).nextInt();
        System.out.printf("Enter value user want change: ");
        String name = new Scanner(System.in).nextLine();
        Supplier sup = new Supplier();
        for (int i = 0; i < sup.ListSupplier.size(); i++) {
            if (sup.ListSupplier.get(i).getId() == id) {
                sup.ListSupplier.get(i).setName(name);
                
            }
        }
    }

    public void displaySupplier(ArrayList<Supplier> ListSupplier) {
        for (int i = 0; i < ListSupplier.size(); i++) {
            System.out.println(ListSupplier.get(i));
        }
    }

}
