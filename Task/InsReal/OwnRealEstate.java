package com.InsReal;

public class OwnRealEstate extends RealEstate {
    private int square;
    private int qtyRoom;
    public OwnRealEstate() {}
        public OwnRealEstate (String typeEstate, int valueEstate, int yearProduce,int square,int qtyRoom ){
        super(typeEstate,valueEstate,yearProduce);
        this.square= square;
        this.qtyRoom= qtyRoom;
    }
    public void setOwnRealEstate(int square,int qtyRoom){
        this.square= square;
        this.qtyRoom= qtyRoom;
    }
    public void getOwnRealEstate (){
        System.out.println("The square" + this.square);
        System.out.println("Quantity room" + this.qtyRoom);
            }

}
