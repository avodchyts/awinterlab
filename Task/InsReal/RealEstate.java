package com.InsReal;

public class RealEstate {
    private String typeEstate;
    private int valueEstate;
    private int yearProduce;
    public RealEstate() { }
    public RealEstate(String typeEstate, int valueEstate, int yearProduce) {
        this.typeEstate = typeEstate;
        this.valueEstate = valueEstate;
        this.yearProduce = yearProduce;
    }
    public void setRealEstate(String typeEstate, int valueEstate, int yearProduce) {
        this.typeEstate = typeEstate;
        this.valueEstate = valueEstate;
        this.yearProduce = yearProduce;
    }
    public void getRealEstate() {
        System.out.println("Type Estate - " + this.typeEstate);
        System.out.println("valueEstate -" + this.valueEstate);
        System.out.println("yearProduce - " + this.yearProduce);
    }
}
