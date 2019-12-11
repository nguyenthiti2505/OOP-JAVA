
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;


import java.util.ArrayList;
import java.util.Date;
import static jdk.nashorn.internal.runtime.Debug.id;
import static selling_mobile_manager.Product.ListProduct;

/**
 *
 * @author quyen.tran
 */
public abstract class Person {
    protected int id;
    protected String name;
    protected int age;
    protected Date birthday;
    protected String address;
    protected int phonenumber;
    
    
    
    public Person(){
        
    }
    public Person(int id, String name, Date birthday, String address, int phonenumber){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    public Person(String name, Date birthday, String address, int phonenumber){
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    
    public  Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
   public ArrayList<Product> getProduct(){
        return ListProduct;
    }
   
   public void viewProduct(){
        System.out.println("========== Get Product==========");
        Product prod = new Product();
        prod.displayProduct(ListProduct);
    }
   
   public void enterInfor(){
       
   }
   
   
    @Override
   public String toString() {  
        return   address;
    }  
    
  
   
}
