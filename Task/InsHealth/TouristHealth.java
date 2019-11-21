package com.InsHealth;

public class TouristHealth extends Health {
    private String country;
    private int qtyDay;

    public TouristHealth() {}
       public TouristHealth (String name, int age, String sex, String nationality, String country, int qtyDay ){
        super(name,age, sex, nationality);
        this.country= country;
        this.qtyDay= qtyDay;
    }
    public void setTouristHealth(String country, int qtyDay){
        this.country= country;
        this.qtyDay= qtyDay;
    }
    public void getTouristHealth (){
        System.out.println("The country" + this.country);
        System.out.println("Quantity days" + this.qtyDay);
    }
}
