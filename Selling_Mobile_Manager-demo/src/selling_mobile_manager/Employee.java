
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
 * @author quyen.tran
 */
public class Employee extends Person {

    protected double salary;
    protected Date hire;
    protected String position;

    static ArrayList<Employee> ListEmployee = new ArrayList<Employee>();

    public Employee() {
        
    }

    public Employee(String name, Date birthday, String address, int phonenumber) {
        super(name, birthday, address, phonenumber);
    }

    public Employee(double salary) {
        this.salary = salary;
        
    }

    public Employee(String name, Date birthday, String address, int phonenumber, double salary, String position) {
        super(name, birthday, address, phonenumber);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "         "+getName() + "         " +getBirthday() + "          " + getAddress() + "           " + getPhonenumber()+"          "+getSalary()+"          "+getPosition()+"\n";
    }
    
    public static void printInvoiceHeader() {
        System.out.printf("%-10s %-10s %-30s %-20s %-20s %-10s %s\n", "ID", "NAME", "BIRTHDAY", "ADDRESS", "PHONENUMBER", "SALARY", "POSITION");
        
    }

    /**
     *
     */
    public void enterInforEmployee() throws ParseException {
        System.out.print("Enter your e_Name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter the birthday: ");
        String bod = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date d1 = df.parse(bod);
        System.out.print("Enter your e_Address: ");
        String address = new Scanner(System.in).nextLine();
        System.out.print("Enter your e_Phonenumber: ");
        int phone = new Scanner(System.in).nextInt();
        ListEmployee.add(new Employee(name, d1, address, phone, getSalary(), getPosition()));
    }
    
    public void displayEmployee(ArrayList<Employee> ListEmployee) {
        int id = 0;
           for (int i = 0; i < ListEmployee.size(); i++) {
            id = id + 1;
           System.out.print("ID" + id);
           System.out.print(ListEmployee.get(i));
          }
        
    }

   public Employee update(Employee em) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.print("- Old Name: " + em.name + "\n" + "  Enter New Name : ");
        String name;
        name = input.nextLine();
        setName(name);
        //birthday
        System.out.print("- Old Birthday: " + em.birthday + "\n" + "  Enter New birthday : ");
        String bod = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date d1 = df.parse(bod);
        Date birthday;
        setBirthday(d1);
        //address
        System.out.print("- Old Address: " + em.address + "\n" + "  Enter New address : ");
        String address;
        address = input.nextLine();
        setAddress(address);
        //phone
        System.out.print("- Old Phone: " + em.phonenumber + "\n" + "  Enter New phonenumber : ");
        int phone;
        phone = input.nextInt();
        setPhonenumber(phone);
        return em;
    }
   
    public void deleteEmployee(int deleteId) {
        ListEmployee.remove(deleteId);
        for (Employee object : ListEmployee) {
            System.out.println("ID" + deleteId);
            System.out.println(object.toString());
            deleteId = deleteId + 1;
        }
    }
    
}
