
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.ArrayList;
import java.util.Scanner;
import static selling_mobile_manager.Supplier.ListSupplier;

/**
 *
 * @author quyen.tran
 */
public class Category {
    int id;
    String name;
    Supplier supplier;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier.getName();
    }

    public static ArrayList<Category> getListCategory() {
        return ListCategory;
    }

    public Category(int id, String name, Supplier nameSuplier) {
       this.id = id;
       this.name = name;
       this.supplier = nameSuplier;
    }
    public Category(){
        id++;
    }
    
    @Override
     public String toString(){
        return ""+getId()+"                   "+getName()+"                    "+getSupplier();
    }
     
    public static void printInvoiceHeader() {
    System.out.printf("%-20s %-20s %s\n","ID", "NAME","SUPPLIER");

    }
    
    static ArrayList<Category> ListCategory = new ArrayList<Category>();
 
}
