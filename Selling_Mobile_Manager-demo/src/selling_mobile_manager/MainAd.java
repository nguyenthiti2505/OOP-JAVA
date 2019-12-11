/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

import java.text.ParseException;
import java.util.Scanner;
import static selling_mobile_manager.Supplier.ListSupplier;
import static selling_mobile_manager.Category.ListCategory;
import static selling_mobile_manager.Employee.ListEmployee;
import static selling_mobile_manager.Employee.printInvoiceHeader;
import static selling_mobile_manager.Login.enterAccount;
import static selling_mobile_manager.Product.ListProduct;

/**
 *
 *
 * @author quyen.tran
 */
public class MainAd {

    public void menu() {
        System.out.println("=============MENU=================");
        System.out.println("What field do you belong to?");
        System.out.println("1: Supplier");
        System.out.println("2: Employee");
    }

    public void menu2() {
        System.out.println("======================================\n");
        System.out.println("1. Name of supplier");
        System.out.println("2. Change information of supplier");
        System.out.println("3. Delete information of supplier");

    }

    public void Supplier() {
        while (true) {
            menu2();
            System.out.println("Please enter number: ");
            int x = new Scanner(System.in).nextInt();
            Supplier supplier = new Supplier();
            switch (x) {
                case 1:
                    System.out.println("==============Supplier===============");
                    try {
                        supplier.supplierInfor();
                        supplier.printInvoiceHeader();
                        supplier.displaySupplier(ListSupplier);
                    } catch (Exception e) {
                        System.err.println("Arithmetic Exception occurs!");
                    }
                    back();
                    break;
                case 2:
                    try {
                        System.out.println("-----------Update information------------------\n");
                        supplier.updateSuplier(ListSupplier);
                        supplier.displaySupplier(ListSupplier);
                    } catch (Exception e) {
                        System.err.println("Arithmetic Exception occurs!");
                    }
                    back();
                    break;
                case 3:
                    try {
                        System.out.println("-----------Delete Supplier--------------\n");
                        System.out.println("Enter id supplier: ");
                        int id = new Scanner(System.in).nextInt();
                        supplier.deleteSuplier(id, ListSupplier);
                        supplier.displaySupplier(ListSupplier);
                    } catch (Exception e) {
                        System.err.println("Arithmetic Exception occurs!");
                    }
                    back();
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }

    public void menu3() {
        try{
            System.out.println("Your position:");
            System.out.println("1. Stocker");
            System.out.println("2. Saleman");
        }catch(Exception e) {
            System.err.println("Arithmetic Exception occurs!");
        }
        
    }

    public void menu4(){
        System.out.println("===========STOCKER==================\n");
                            System.out.println(" -------Information of Stocker------ ");
                            System.out.printf("1. Add information \n");
                            System.out.printf("2. Display information \n");
                            System.out.printf("3. Update information \n");
                            System.out.printf("4. Delete stocker\n\n");
                            System.out.println(" -------Information of Category------ ");
                            System.out.printf("5. Enter category\n\n");
                            System.out.println(" -------Information of Product------");
                            System.out.printf("6. Display information of product\n");
                            System.out.printf("7. Add product \n");
                            System.out.printf("8. Update Product \n");
                            System.out.printf("9. Delete Product \n\n");
    }
    
    public void employee() throws ParseException, selling_mobile_manager.ParseException {
        System.out.println("====================WELCOME TO EMPLOYEE========================\n");
        Scanner input = new Scanner(System.in);
        while (true) {
            menu3();
            System.out.println("Please enter number: ");
            int x = new Scanner(System.in).nextInt();
            switch (x) {
                case 1:             
                    Stocker stocker = new Stocker();
                    Product pro = new Product();
                    try {
                       while (true) {
                        menu4();
                        System.out.printf("Please enter number ");
                        int q = new Scanner(System.in).nextInt();
                        switch (q) {
                            case 1:
                                try {
                                    System.out.println("------------------Enter Information------------\n");
                                    stocker.enterInforEmployee();
                                    } catch (Exception e) {
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    menu4();
                                    break;
                            case 2:
                                try {
                                    System.out.println("------------------Display Employee ----------------\n");
                                    printInvoiceHeader();
                                    stocker.displayEmployee(ListEmployee);
                                    } catch (Exception e) {
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    menu4();    
                                    break;
                            case 3:
                                try {
                                    System.out.println("-----------------Update Infor of Employee---------------\n");
                                    printInvoiceHeader();
                                    int id = 0;
                                    for (Employee object : ListEmployee) {
                                    id = id + 1;
                                    System.out.print("ID" + id);
                                    System.out.println(object.toString());
                                        }
                                    System.out.println("\n");
                                    System.out.print("Enter ID update: ");
                                    id = input.nextInt();
                                    ListEmployee.get(id - 1).update(ListEmployee.get(id - 1));
                                    printInvoiceHeader();
                                    System.out.println(ListEmployee.get(id - 1));
                                        
                                    } catch (Exception e) {
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    menu4();
                                    break;
                            case 4:
                                try {
                                    System.out.println("------------------Delete Employess --------------");
                                    printInvoiceHeader();
                                    int idDelete = 0;
                                    for (Employee object : ListEmployee) {
                                    idDelete = idDelete + 1;
                                        System.out.print("ID" + idDelete);
                                        System.out.println(object.toString());
                                        }
                                        System.out.print("Enter ID Delete: ");
                                        idDelete =input.nextInt();
                                        ListEmployee.get(idDelete-1).deleteEmployee(idDelete-1);
                                        printInvoiceHeader();
                                        System.out.println(ListEmployee.get(idDelete-1));
                                        menu4();
                                        break;
                                    } catch (Exception e) {
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    menu4();
                                    break;
                                case 5: 
                                    try{
                                        System.out.println("-----------------Enter category----------------------------\n");
                                        pro.enterCategory();
                                    }catch(Exception e){
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    menu4();
                                    break;
                                case 6:
                                    System.out.println("------------------Display infor Product ----------------\n");
                                    try {
                                       pro.viewProduct();
                                    } catch (Exception e) {
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    mainMenu();
                                    break;
                                case 7:
                                    System.out.println("-----------------------Add Product-----------------------\n");
                                    try {
                                    pro.enterProduct();
                                    } catch (Exception e){
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    mainMenu();
                                    break;
                                    
                                case 8:
                                    System.out.println("------------------------ Update Product -------------------\n");
                                    try {
                                        pro.updateProduct(ListProduct);
                                    } catch (Exception e){
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    mainMenu();
                                    break;
                                case 9: 
                                    System.out.println("-------------------------Delete Product-----------------------\n");
                                    try {
                                    pro.deleteProduct();
                                    } catch (Exception e){
                                        System.err.println("Arithmetic Exception occurs!");
                                    }
                                    mainMenu();
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }

                    } catch (Exception e) {
                        System.err.println("Arithmetic Exception occurs!");
                    }
                    mainMenu();
                    break;

                case 2:
                    Salesman bill = new Salesman();
                    System.out.println("Do you want to create bill ?\n");
                    System.out.println("Add bill\n");
                    System.out.println("View biil");
                    int q = new Scanner(System.in).nextInt();
                    switch(q){
                        case 1:
                            bill.addBill();
                            break;
                        case 2:
                            bill.viewBill();
                            
                    }
                    
                    
            }
        }
    }

    public void back() {
        System.out.println("Do you want continute!");
        System.out.println("1. Countinute with Supplier");
        
        System.out.println("2. Countinute with filed other");
        System.out.println("3. Exit");
        
        System.out.println("Please enter your number: ");
        int x = new Scanner(System.in).nextInt();
        switch (x) {
            case 1:
                try {
                    Supplier();
                } catch (Exception e) {
                    System.err.println("Error!");
                }
                break;
            case 2:
                try {
                    menu();
                    chose();
                } catch (Exception e) {
                    System.err.println("Error!");
                }
                break;
//            case 3:
//                try {
//                    Supplier sup = new Supplier();
//                    sup.displaySupplier(ListSupplier);
//                    System.out.println("Enter id supplier: ");
//                    int s = new Scanner(System.in).nextInt();
//                    sup.deleteSuplier(s, ListSupplier);
//                    sup.printInvoiceHeader();
//                    sup.displaySupplier(ListSupplier);
//                    back();
//                } catch (Exception e) {
//                    System.err.println("Error!");
//                }
//                break;
//            case 4:
//                try {
//                    Category cate = new Category();
//                    cate.displayCategory(ListCategory);
//                    System.out.println("Enter id supplier: ");
//                    int q = new Scanner(System.in).nextInt();
//                    cate.deleteCategory(q, ListCategory);
//                    cate.printInvoiceHeader();
//                    cate.displayCategory(ListCategory);
//                    back();
//                } catch (Exception e) {
//                    System.err.println("Error!");
//                }
//
//                break;
//            case 5:
//                try {
//                    Product pro = new Product();
//                    pro.displayProduct(ListProduct);
//                    System.out.println("Enter id supplier: ");
//                    int t = new Scanner(System.in).nextInt();
//                    pro.deleteProduct(t, ListProduct);
//                    pro.printInvoiceHeader();
//                    pro.displayProduct(ListProduct);
//                    back();
//                } catch (Exception e) {
//                    System.err.println("Error!");
//                }
//                break;
            case 3:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void mainMenu() throws ParseException, selling_mobile_manager.ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println(" Enter 1 to CONTINUE\n Enter 2 to MENU\n Enter 3 to EXIT ");
        System.out.println("------------------------");
        int n = input.nextInt();
        switch (n) {
            case 1: {
                menu4();
                break;
            }
            case 2: {
                enterAccount();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
        }
    }
    public void chose() throws ParseException, selling_mobile_manager.ParseException {
        menu();
        while (true) {
            System.out.println("Please enter your field: ");
            int variable = new Scanner(System.in).nextInt();
            switch (variable) {
                case 1:
                    Supplier();
                    back();
                case 2:
                    employee();
                    menu4();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
