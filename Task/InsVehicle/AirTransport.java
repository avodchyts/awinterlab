package com.InsVehicle;

import java.util.Scanner;

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

   public void setLengthWing(int lengthWing) {this.lengthWing= lengthWing;}
   public void getLengthWing(){ System.out.println("The length of wings"+ " " + this.lengthWing);}

    public void setTypeEngine(String typeEngine){this.typeEngine= typeEngine; }
    public void getTypeEngine (){ System.out.println("The type of engine"+ " " + this.typeEngine);    }

    public void setQtyEngine (int qtyEngine) {this.qtyEngine= qtyEngine;}
    public void getQtyEngine (){ System.out.println("The quantity of engines"+ " " + this.qtyEngine);}

    public void setSizeVolume (int sizeVolume) {this.sizeVolume = sizeVolume;}
    public void getSizeVolume (){System.out.println("Size of volume"+ " " + this.sizeVolume);}

    public static int AirTransportInsurance(){
        int coeflengthWing = 1  ;
        int coefTypeEngine = 1 ;
        int coefQtyEngine = 1 ;
        int coefSizeVolume =1 ;
        final int k =5; // insurance coefficient
        int result;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of wings: ");
        int lengthWing = in.nextInt();

            switch (lengthWing) {
                case 30:
                    coeflengthWing = 1;
                    break;
                case 40:
                    coeflengthWing = 2;
                    break;
            }

        System.out.print("Enter Type of Engines: ");
        String typeEngine = in.next();

        switch (typeEngine){
            case "reactive" :
                coefTypeEngine = 1;
                break;
            case "turboreactive" :
                coefTypeEngine = 2;
                break;
        }

        System.out.print("Enter quantity of engines: ");
        int qtyEngine = in.nextInt();

        switch (qtyEngine){
            case 2:
                coefQtyEngine = 1;
                break;
            case 4:
                coefQtyEngine = 2;
                break;
        }

        System.out.print("Enter Size Volume: ");
        int sizeVolume = in.nextInt();

        switch (sizeVolume){
            case 100 :
                coefSizeVolume = 1;
                break;
            case 200:
                coefSizeVolume = 2;
                break;
        }
        result = (coeflengthWing + coefTypeEngine + coefQtyEngine+ coefSizeVolume) * k ;
        return result;
    }
}

