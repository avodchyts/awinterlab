package com.InsVehicle;

public class AirTransport extends Vehicle {
    private int lengthWing;
    private String typeEngine;
    private int qtyEngine;
    private int sizeVolume;

    @Override
    public void Vehicle (String typeVehicle, int valueVehicle, int yearProduce){
        this.typeVehicle = typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }

   public AirTransport () { }
      public AirTransport (int lengthWing, String typeEngine, int qtyEngine, int sizeVolume){
         this.lengthWing= lengthWing;
         this.typeEngine= typeEngine;
         this.qtyEngine= qtyEngine;
         this.sizeVolume = sizeVolume;
   }

   public void setLengthWing(int lengthWing) {this.typeEngine= typeEngine;}
   public void getLengthWing(){ System.out.println("The length of wings"+ " " + this.lengthWing);}

    public void setTypeEngine(String typeEngine){this.typeEngine= typeEngine; }
    public void getTypeEngine (){ System.out.println("The type of engine"+ " " + this.typeEngine);    }

    public void setQtyEngine (int qtyEngine) {this.qtyEngine= qtyEngine;}
    public void getQtyEngine (){ System.out.println("The type of engine"+ " " + this.typeEngine);}


    public void setSizeVolume (int sizeVolume) {this.sizeVolume = sizeVolume;}
    public void getSizeVolume (){System.out.println("Quantity of engine"+ " " + this.qtyEngine);}


}
