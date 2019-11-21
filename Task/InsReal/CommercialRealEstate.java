package com.InsReal;

public class CommercialRealEstate extends RealEstate {
    private int square;
    private int qtyoffices;
    public CommercialRealEstate() {}
       public CommercialRealEstate (String typeEstate, int valueEstate, int yearProduce,int square,int qtyoffices ){
        super(typeEstate,valueEstate,yearProduce);
        this.square= square;
        this.qtyoffices= qtyoffices;
    }
    public void setCommercialRealEstate(int square,int qtyoffices){
        this.square= square;
        this.qtyoffices= qtyoffices;
    }
    public void getCommercialRealEstate (){
        System.out.println("The square" + this.square);
        System.out.println("Quantity Offices" + this.qtyoffices);
    }
}
