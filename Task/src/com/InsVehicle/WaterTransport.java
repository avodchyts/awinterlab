package com.InsVehicle;

public class WaterTransport extends Vehicle {

    private int waterVolume;
    private int powerEngine;
    private int lengthBoat;

    @Override
    public void Vehicle (String typeVehicle, int valueVehicle, int yearProduce ){
        this.typeVehicle= typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }
    public WaterTransport () {}
      public WaterTransport (int waterVolume, int powerEngine, int lengthBoat){
      this.waterVolume = waterVolume;
      this.powerEngine = powerEngine;
      this.lengthBoat = lengthBoat;
  }

  public void setWaterVolume (int waterVolume){this.waterVolume = waterVolume;}
  public void getWaterVolume(){System.out.println("Water volume"+ " " + this.waterVolume);}

  public void setPowerEngine(int powerEngine){this.powerEngine = powerEngine;}
  public void getPowerEngine() {System.out.println("Power of engine"+ " " + this.powerEngine);}

  public void setLengthBoat(int lengthBoat){this.lengthBoat = lengthBoat;  }
  public void getLengthBoat (){ System.out.println("Length of boat"+ " " + this.lengthBoat);  }
}
