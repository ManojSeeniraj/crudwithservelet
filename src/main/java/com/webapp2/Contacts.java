package com.webapp2;

/**
 * Contact
 */
public class Contacts {

    
    private String emailid;
    private String phone;

    Contacts() {
    }

    public Contacts(String emailid, String phone) {
        
        this.emailid = emailid;
        this.phone = phone;
    }

    /**
     * @return the emailid
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * @param emailid the emailid to set
     */
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    


    @Override
    public String toString() {
        return "Email:"+emailid+ ", phone:"+phone;
    }
}