package com.InsVehicle;

public class RailwayTransport extends Vehicle {
  private String typeTrain;
  private int qtyCarriage;
  private int maxSpeed;
  @Override
  public void Vehicle (String typeVehicle, int valueVehicle, int yearProduce) {
      this.typeVehicle = typeVehicle;
      this.valueVehicle = valueVehicle;
      this.yearProduce = yearProduce;
  }
   public RailwayTransport() {}
      public RailwayTransport( String typeTrain, int qtyCarriage, int maxSpeed){
      this.typeTrain = typeTrain;
      this.qtyCarriage = qtyCarriage;
      this.maxSpeed = maxSpeed;
  }
  public void setTypeTrain(String typeTrain) {this.typeTrain = typeTrain;}
  public void getTypeTrain () {System.out.println("Type of train"+ " " + this.typeTrain);}

  public void setQtyCarriage(int qtyCarriage) {this.qtyCarriage = qtyCarriage;}
  public void getQtyCarriage () { System.out.println("Quantity of carriage"+ " " + this.qtyCarriage);}

  public void setMaxSpeed(int maxSpeed){ this.maxSpeed = maxSpeed; }
  public void getMaxSpeed (){ System.out.println("Max speed "+ " " + this.maxSpeed);  }
}
