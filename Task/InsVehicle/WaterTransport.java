package com.InsVehicle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WaterTransport extends Transport implements IInsuranceCoeff {

    private int waterVolume;
    private int powerEngine;
    private int lengthBoat;
    private Set<WaterTransport> waterTransports = new HashSet<WaterTransport>();

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


        Scanner in = new Scanner(System.in);
        System.out.print("Enter water volume: ");
        int waterVolume = in.nextInt();

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
        System.out.print("Enter power engine: ");
        int powerEngine = in.nextInt();
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

        System.out.print("Enter length boat: ");
        int lengthBoat = in.nextInt();

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

        result = (coefwaterVolume + coefpowerEngine + coeflengthBoat) * K4;
        return result;
    }


    @Override
    public void insuranceCoef ( int n){System.out.println("Insurance coefficient for water transport:"+ "" + K4 ); }

    @Override
    public String toString() {
        return ("Water volume" + " " + waterVolume + " " + "Power engine" + " " + powerEngine + " " + "Length boat" + " " + lengthBoat);
    }

}
