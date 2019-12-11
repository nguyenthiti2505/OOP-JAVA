
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selling_mobile_manager;

/**
 *
 * @author admin
 */
class User {

    private String user;
    private String user0;
    private String pass;


    public User(String user, String pass) {
        this.user=user;
        this.pass=pass;
        
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getPass() {
        return pass;
    }

    
}
