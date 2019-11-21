package com.InsVihcle;

public class AirTransport extends Vihcle {
    private int lengthWing;
    private String typeEngine;
    private int qtyEngine;
    private int sizeVolume;

    public AirTransport() {}
       public AirTransport (String typeVihcle, int valueVihcle,int yearProduce,int lengthWing, String typeEngine, int qtyEngine, int sizeVolume){
        super(typeVihcle,valueVihcle,yearProduce);
        this.lengthWing= lengthWing;
        this.typeEngine= typeEngine;
        this.qtyEngine= qtyEngine;
        this.sizeVolume = sizeVolume;
    }
    public void setAirTransport(int lengthWing, String typeEngine, int qtyEngine, int sizeVolume){
        this.lengthWing= lengthWing;
        this.typeEngine= typeEngine;
        this.qtyEngine= qtyEngine;
        this.sizeVolume = sizeVolume;
    }
    public void getAirTransport (){
        System.out.println("The length of wings" + this.lengthWing);
        System.out.println("The type of engine" + this.typeEngine);
        System.out.println("Quantity of engine" + this.qtyEngine);
        System.out.println("Size volume" + this.sizeVolume);
    }
}
