/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

/**
 *
 * 
 * @author admin
 */
class Admin {
    private String admin;
    private String pass;
    public Admin(String admin, String pass) {
        this.admin=admin;
        this.pass=pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }   
}
