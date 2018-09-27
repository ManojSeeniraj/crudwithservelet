package com.webapp2;

/**
 * databaseGetter
 */
public class databaseGetter {

    private int id;
    private String name;
    private String price;
    private String taste;
    private  Float discount;


    databaseGetter(){

    }

    public databaseGetter(int id,String name,String price,String taste, Float discount){

        this.id=id;
        this.name=name;
        this.price=price;
        this.taste=taste;
        this.discount=discount;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }


    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }


    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * @return the discount
     */
    public Float getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Float discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "id:"+id+" "+"Name:"+name+" "+"Price:"+price+" "+"Taste:"+taste+" "+"Discount:"+discount;
    }
}