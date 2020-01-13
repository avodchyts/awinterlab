package com.InsVehicle;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WaterTransport extends Transport implements IInsuranceCoeff {

    private int waterVolume;
    private int powerEngine;
    private int lengthBoat;
    private Set<WaterTransport> waterTransports = new HashSet<WaterTransport>();
    private static final Logger LOGGER = Logger.getLogger(WaterTransport.class);

    @Override
    public void Vehicle (String typeVehicle, int valueVehicle, int yearProduce ){
        this.typeVehicle= typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }
    public WaterTransport () {}
      public WaterTransport (int waterVolume, int powerEngine, int lengthBoat){
      this.waterTransports = new HashSet<WaterTransport>();
        this.waterVolume = waterVolume;
      this.powerEngine = powerEngine;
      this.lengthBoat = lengthBoat;
  }

  public void addWaterTransport(WaterTransport waterTransport) {waterTransports.add(waterTransport);}
  public  Set<WaterTransport> getListofWaterTransport ()// warning
  {
      Iterator<WaterTransport> d = waterTransports.iterator();
      while( d.hasNext()){System.out.println(d.next());}
      return waterTransports;

  }
  public void setWaterVolume (int waterVolume){this.waterVolume = waterVolume;}
  public void getWaterVolume(){System.out.println("Water volume"+ " " + this.waterVolume);}

  public void setPowerEngine(int powerEngine){this.powerEngine = powerEngine;}
  public void getPowerEngine() {System.out.println("Power of engine"+ " " + this.powerEngine);}

  public void setLengthBoat(int lengthBoat){this.lengthBoat = lengthBoat;  }
  public void getLengthBoat (){ System.out.println("Length of boat"+ " " + this.lengthBoat);  }

    public int waterTransportInsurance() {
        int coefwaterVolume = 1;
        int coefpowerEngine = 1;
        int coeflengthBoat = 1;
        int result;

        LOGGER.debug("Water volume" + " "+ this.waterVolume);

        switch (this.waterVolume) {
            case 10000:
                coefwaterVolume = 1;
                break;
            case 20000:
                coefwaterVolume = 2;
                break;
            default:
                coefwaterVolume = 0;

        }
        LOGGER.debug("Power engine" + " "+this.powerEngine);
          switch (this.powerEngine) {
            case 200:
                coefpowerEngine = 1;
                break;
            case 500:
                coefpowerEngine = 2;
                break;
            case 1000:
                coefpowerEngine = 3;
                break;

            default:
                System.out.println(0);

        }
        LOGGER.debug("Lenth of boat" + " "+this.lengthBoat);
        switch (this.lengthBoat) {
            case 15:
                coeflengthBoat = 1;
                break;
            case 30:
                coeflengthBoat = 2;
                break;

            default:
                coeflengthBoat = 4;
        }

        result = (coefwaterVolume + coefpowerEngine + coeflengthBoat)*2000 * K4;
        LOGGER.debug("Result" + " "+ result);
        return result;
    }


    @Override
    public void insuranceCoef ( int n){System.out.println("Insurance coefficient for water transport:"+ "" + K4 ); }

    @Override
    public String toString() {
        return ("Water volume" + " " + waterVolume + " " + "Power engine" + " " + powerEngine + " " + "Length boat" + " " + lengthBoat);
    }

}
