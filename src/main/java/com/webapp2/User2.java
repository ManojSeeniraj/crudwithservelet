package com.webapp2;

/**
 * User
 */
public class User2 {

   
    private String email;
    private String password;


    public User2(String email,String password){
       
        this.email=email;
        this.password=password;
    }


   
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "Email:"+email+" "+"Password:"+password;
    }
}