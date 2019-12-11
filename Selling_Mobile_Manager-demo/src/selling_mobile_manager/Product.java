
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.util.ArrayList;
import java.util.Scanner;
import static selling_mobile_manager.Category.ListCategory;

/**
 *
 * @author admin
 */
public class Product {

    static ArrayList<Product> ListProduct = new ArrayList<Product>();
    int id_pro;
    String name_pro;
    float price;
    int quantity;
    String status;
    Supplier supplier;
    Category category;
    
    public Product() {
        id_pro++;
    }

    public Product(int id_pro, String name_pro, float price, int quantity, String status, Supplier supplier, Category category) {
        this.id_pro = id_pro;
        this.name_pro = name_pro;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.supplier = supplier;
        this.category = category;

    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupplier() {
        return supplier.getName();
    }

    public String getCategory() {
        return category.getName();
    }

    public ArrayList<Product> viewProduct() {
        printInvoiceHeader();
        return ListProduct;
    }

    @Override
    public String toString() {
        return "" + getId_pro() + "          " + getName_pro() + "          " + getPrice() + "          " + getQuantity() + "          " + getStatus() + "          " + getSupplier() + "          " + getCategory();
    }

    public static void printInvoiceHeader() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %s\n", "ID", "NAME", "PRICE", "QUANTITY", "STATUS", "SUPPLIER", "CATEGORY");
    }

public void deleteProduct(){
        System.out.println("Enter id you want delete: ");
        int x = new Scanner(System.in).nextInt();
        Product product = new Product();
        for (int i = 0; i < product.ListProduct.size(); i++) {
            if (product.ListProduct.get(i).getId_pro() == x) {
                product.ListProduct.remove(i);
            }
        }
    }
    
    public void updateProduct(ArrayList<Product> ListProduct) {
        System.out.printf("Enter id product: ");
        int id = new Scanner(System.in).nextInt();
        System.out.printf("Enter new name product: ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Entre new price: ");
        int price = new Scanner(System.in).nextInt();
        System.out.printf("Enter quantity: ");
        int quantity = new Scanner(System.in).nextInt();
        Product pro = new Product();
        for (int i = 0; i < pro.ListProduct.size(); i++) {
            if (pro.ListProduct.get(i).getId_pro() == id) {
                ListProduct.get(i).setName_pro(name);
                ListProduct.get(i).setName_pro(name);
                ListProduct.get(i).setPrice(price);
                ListProduct.get(i).setQuantity(quantity);
            }
        }
    }
    
        public void enterProduct() {
        System.out.println("Enter id: ");    
        int id_pro = new Scanner(System.in).nextInt();
        System.out.printf("Enter name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.printf("Enter price: ");
        float price = new Scanner(System.in).nextFloat();
        System.out.printf("Enter quantity: ");
        int quantity = new Scanner(System.in).nextInt();
        System.out.printf("Enter status: ");
        String status = new Scanner(System.in).nextLine();
        System.out.printf("Enter name suplier: ");
        String name1 = new Scanner(System.in).nextLine();
        System.out.printf("Enter name category: ");
        String name2 = new Scanner(System.in).nextLine();
        Supplier sup = new Supplier();
        Category cate = new Category();
        for (int i = 0; i < sup.ListSupplier.size(); i++) {
            for (int j = 0; j < cate.ListCategory.size(); j++) {
                if (sup.ListSupplier.get(i).getName().equals(name1) || cate.ListCategory.get(j).getName().equals(name2)) {
                    ListProduct.add(new Product(id_pro, name, price, quantity, status, Supplier.ListSupplier.get(i), cate.ListCategory.get(j)));
                } else {
                    System.out.println("Dont have name's supplier or name's category!");
                    System.out.println("=============================================");
                }
            }
        }

    }
        public void displayProduct(ArrayList<Product> ListProduct) {
        for (int i = 0; i < ListProduct.size(); i++) {
            System.out.println(ListProduct.get(i));
        }
    }
    
       public void enterCategory(){  
        System.out.printf("Enter id: ");
        int id = new Scanner(System.in).nextInt();
        if (checkId(id)==1) {
            System.out.printf("Enter name's category: ");
            String name = new Scanner(System.in).nextLine();
            System.out.printf("Enter your name supplier: ");
            String id1 = new Scanner(System.in).nextLine();
            Supplier sup = new Supplier();
            for (int i = 0; i < sup.ListSupplier.size(); i++) {
                if (sup.ListSupplier.get(i).getName().equals(id1)) {
                    ListCategory.add(new Category(id, name, sup.ListSupplier.get(i)));  
                }
            }
        }
        else{
            System.out.println("Id exist!");
        }
    }
    
     public static int checkId(int a){
        Category cate = new Category();
        for (int i = 0; i < cate.ListCategory.size(); i++) {
            if (cate.ListCategory.get(i).getId() == a) {
                return 0;
            }
        }
       return 1;
    }

    
     public void deleteCategory(int id, ArrayList<Category> ListCategory){
        Category cate = new Category();
        for (int i = 0; i < cate.ListCategory.size(); i++) {
            if (cate.ListCategory.get(i).getId() == id) {
                cate.ListCategory.remove(i);
            }
        }
    }
    public void displayCategory(ArrayList<Category> ListCategory){
        for (int i = 0; i < ListCategory.size(); i++) {
            System.out.println(ListCategory.get(i));
		}
        }
    
}
