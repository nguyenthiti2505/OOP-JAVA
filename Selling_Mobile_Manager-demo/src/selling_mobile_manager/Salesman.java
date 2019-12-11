/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tcuslate file, choose Tools | Tcuslates
 * and open the tcuslate in the editor.
 */
package selling_mobile_manager;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ti.nguyen
 */
public class Salesman {
    public static int CodeSalesmandem = 1;
    public int CodeSalesman;
    static ArrayList<Salesman> ListBill = new ArrayList<Salesman>();
    public ArrayList<Product> listPro = new ArrayList<>();
    private String DatePay;
    private double Amount;
    

    public Salesman() {
    }

    public Salesman(String DatePay, double Amount, ArrayList<Product> listPro) {
        this.listPro = listPro;
        this.CodeSalesman = CodeSalesmandem++;
        this.DatePay = DatePay;
        this.Amount = Amount;
        
    }

    public Salesman(ArrayList<Product> listPro, String DatePay) {
        this.CodeSalesman = CodeSalesmandem++;

        this.listPro = listPro;
        this.DatePay = DatePay;
        
    }

    public int getCodeSalesman() {
        return CodeSalesman;
    }

    public void setCodeSalesman(int CodeSalesman) {
        this.CodeSalesman = CodeSalesman;
    }

    public void setCodeProd(ArrayList<Salesman> ListBill) {
        this.ListBill = ListBill;
    }

    public String getDatePay() {
        return DatePay;
    }

    public void setDatePay(String DatePay) {
        this.DatePay = DatePay;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public static ArrayList<Salesman> getListBill() {
        return ListBill;
    }

    public ArrayList<Product> getListPro() {
        return listPro;
    }

    static Product pr = new Product();
    static MainCus cus = new MainCus();

    public void addBill() throws ParseException, ParseException, selling_mobile_manager.ParseException, selling_mobile_manager.ParseException, selling_mobile_manager.ParseException, selling_mobile_manager.ParseException, selling_mobile_manager.ParseException {
        setCodeSalesman(ListBill.size());
        ArrayList<Product> listPro = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int quantity = 0 ;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter code you want to add bill:");
            int chon = 0 ;
            int tam = chon - 1;
            for (int j = 0; j < pr.ListProduct.size(); j++) {
                if (tam == j) {
                    listPro.add(pr.ListProduct.get(j));
                }
            }
        }

        System.out.println("Enter Date Pay :");
        String DatePay = input.nextLine();
        ListBill.add(new Salesman(listPro, DatePay));
        System.out.println("Do you want to continous?");
        System.out.println("1.Continue\t\t\t2.Back");
        int choose = 0;
        switch (choose) {
            case 1:
                addBill();
                break;
            case 2:
                break;
            default:
                
                break;
        }
    }

    public String getNameProd() {
        String name = "";
        for (Salesman bill : ListBill) {
            if (bill.getCodeSalesman() == CodeSalesman) {
                for (Product products : bill.getListPro()) {
                    name = name + "," + products.getName_pro();
                }
            }
        }
        return name;
    }

    public void viewBill() throws ParseException, selling_mobile_manager.ParseException {
        if (ListBill.size() == 0) {
            System.out.println("BILL IS EMPTY!");
        } else {
            System.out.println("----------LIST PRODUCTS-----------");
            System.out.println("Code Bill\tName Products\tDate Pay\t\tVAT");
            for (int i = 0; i < ListBill.size(); i++) {
                System.out.println(ListBill.get(i).getCodeSalesman() + "\t" + ListBill.get(i).getNameProd() + "\t\t"
                        + ListBill.get(i).DatePay + "\t\t" 
                );
            }
        }
        System.out.println("what do you want?");
        System.out.println("1.Delete\t\t\t2.Add\t\t\t3.Back");
        int chose = 0;
        switch (chose) {
            case 1:
                deleteSalesman();
                break;
            case 2:
                addBill();
                break;
            case 3:
                break;
            default:
                viewBill();
                break;

        }
    }

    public void deleteSalesman() throws ParseException, selling_mobile_manager.ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------- DELETE BILL -------------------------");
        System.out.println("Enter code bill:");
        int code = 0 ;
        int tam = code - 1;

        ListBill.remove(tam);
        viewBill();
    }


}
