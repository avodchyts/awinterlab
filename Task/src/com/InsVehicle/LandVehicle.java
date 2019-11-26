package com.InsVehicle;

public class LandVehicle extends Vehicle {
   private int fullWeight;
   private int qtyAxis;
   private String nameCar;

  @Override
  public void Vehicle (String typeVehicle, int valueVehicle, int yearProduce ){
      this.typeVehicle = typeVehicle;
      this.valueVehicle = valueVehicle;
      this.yearProduce = yearProduce;
  }
    public LandVehicle() {}
  public LandVehicle( int fullWeight, int qtyAxis, String nameCar){
      this.fullWeight = fullWeight;
      this.qtyAxis = qtyAxis;
       this.nameCar = nameCar;
  }

  public void setFullWeight (int fullWeight){this.fullWeight = fullWeight;}
  public void getFullWeight (){System.out.println("Full weight"+ " " + this.fullWeight);}

    public void setQtyAxis (int qtyAxis){this.qtyAxis = qtyAxis;;}
    public void getQtyAxis (){System.out.println("Quantity Axis"+ " " + qtyAxis);}

    public void setNameCar (String nameCar) { this.nameCar = nameCar;  }
    public void getNameCar(){ System.out.println("Name Car"+ " " + nameCar);   }
  }
