package com.InsVihcle;

public class LandVihcle extends Vihcle {
    private int fullWeight;
    private int qtyAxis;
    private String nameCar;

    public LandVihcle() {}
    public LandVihcle ( String typeVihcle, int valueVihcle,int yearProduce,int fullWeight, int qtyAxis, String nameCar){
     super(typeVihcle,valueVihcle,yearProduce);
     this.fullWeight = fullWeight;
     this.qtyAxis = qtyAxis;
     this.nameCar = nameCar;
    }
    public void setLandVihcle (int fullWeight, int qtyAxis, String nameCar) {
        this.fullWeight = fullWeight;
        this.qtyAxis = qtyAxis;
        this.nameCar = nameCar;
    }
        public void getLandVihcle(){
            System.out.println("Full weight " + this.fullWeight);
            System.out.println("Quantity Axis " + qtyAxis);
            System.out.println("Name Car" + nameCar);
        }
    }
