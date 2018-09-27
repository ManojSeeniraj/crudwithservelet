package com.webapp2;

/**
 * UserProfileGetter
 */
public class UserProfileGetter {

    private String Name;
    private String Age;
    private String Address;
    private String Mobile_number;
    private String mail_address;
    private String Comments;

    UserProfileGetter(){

    }

    public UserProfileGetter(String Name,String Age,String Address,String Mobile_number,String mail_address,String Comments){
        this.Name=Name;
        this.Age=Age;
        this.Address=Address;
        this.Mobile_number=Mobile_number;
        this.mail_address=mail_address;
        this.Comments=Comments;
    }


    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return Age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.Age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return Address;
    }


    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.Address = address;
    }


    /**
     * @return the mobile_number
     */
    public String getMobile_number() {
        return Mobile_number;
    }

    /**
     * @param mobile_number the mobile_number to set
     */
    public void setMobile_number(String mobile_number) {
        this.Mobile_number = mobile_number;
    }

    /**
     * @return the mail_address
     */
    public String getMail_address() {
        return mail_address;
    }

    /**
     * @param mail_address the mail_address to set
     */
    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return Comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.Comments = comments;
    }


    @Override
    public String toString() {
        return "Name:"+Name+" "+"Age:"+Age+" "+"Address:"+Address+" "+"Mobile_Number:"+Mobile_number+"Mail_id:"+mail_address+"Comments:"+Comments;
}



}