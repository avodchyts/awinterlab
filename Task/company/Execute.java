package com.company;

import com.InsHealth.TouristHealth;

import com.InsReal.*;
import com.InsVehicle.AirTransport;
import com.InsVehicle.LandVehicle;
import com.InsVehicle.RailwayTransport;
import com.InsVehicle.WaterTransport;

public class Execute {

 public static void main(String[] args){
       AirTransport Boeing = new AirTransport();
        Boeing.setTypeVehicle("Jet");
        Boeing.setValueVehicle(10000);
        Boeing.setYearProduce(2017);
        Boeing.setLengthWing(30);
        Boeing.setTypeEngine("reactive");
        Boeing.setQtyEngine(2);
        Boeing.setSizeVolume(100);

       Boeing.getTypeVehicle();
       Boeing.getValueVehicle();
       Boeing.getYearProduce ();
       Boeing.getLengthWing();
       Boeing.getTypeEngine();
       Boeing.getQtyEngine();
       Boeing.getSizeVolume();

       System.out.println (Boeing);

        LandVehicle DAF = new LandVehicle();
        DAF.setTypeVehicle("Truck");
        DAF.setValueVehicle(500);
        DAF.setYearProduce(2019);
        DAF.setFullWeight (50);
        DAF.setQtyAxis (3);
        DAF.setNameCar ("DAF");

        DAF.getTypeVehicle();
        DAF.getValueVehicle();
        DAF.getYearProduce();
        DAF.getFullWeight ();
        DAF.getQtyAxis ();
        DAF.getNameCar ();

        System.out.println(DAF);

        RailwayTransport Cometa = new RailwayTransport();
        Cometa.setTypeVehicle("Train");
        Cometa.setValueVehicle(1500);
        Cometa.setYearProduce(2010);
        Cometa.setTypeTrain("Electric");
        Cometa.setQtyCarriage(5);
        Cometa.setMaxSpeed(150);

        Cometa.getTypeVehicle();
        Cometa.getValueVehicle();
        Cometa.getYearProduce();
        Cometa.getTypeTrain();
        Cometa.getQtyCarriage();
        Cometa.getMaxSpeed();

        System.out.println(Cometa);

        WaterTransport Titanic = new WaterTransport();
          Titanic.setTypeVehicle("Ship");
          Titanic.setValueVehicle(1000000);
          Titanic.setYearProduce(1909);
          Titanic.setWaterVolume(52310);
          Titanic.setPowerEngine(55000);
          Titanic.setLengthBoat(269);

          Titanic.getTypeVehicle();
          Titanic.getValueVehicle();
          Titanic.getYearProduce();
          Titanic.getWaterVolume();
          Titanic.getPowerEngine();
          Titanic.getLengthBoat();

        System.out.println(Titanic);

        CommercialRealEstate Plaza = new CommercialRealEstate ();
          Plaza.setTypeEstate ("commercial");
          Plaza.setValueEstate(50000);
          Plaza.setYearProduce(2009);
          Plaza.setSquare(1000);
          Plaza.setQtyoffices(5);

          Plaza.getTypeEstate ();
          Plaza.getValueEstate();
          Plaza.getYearProduce();
          Plaza.getSquare();
          Plaza.getQtyoffices();
          Plaza.levelRealEstate(11000);
        System.out.println(Plaza);


        OwnRealEstate Flat = new OwnRealEstate();
        Flat.setTypeEstate("Personal");
        Flat.setValueEstate(1000);
        Flat.setYearProduce (2000);
        Flat.setSquare(120);
        Flat.setQtyRoom(5);

        Flat.getTypeEstate();
        Flat.getValueEstate();
        Flat.getYearProduce ();
        Flat.getSquare();
        Flat.getQtyRoom();
         Flat.levelRealEstate(1000);
        System.out.println(Flat);

        TouristHealth Alex = new TouristHealth();
          Alex.setName("Alex");
          Alex.setAge(30);
          Alex.setSex("male");
          Alex.setNationality("Belarus");
          Alex.setCountry("Thailand");
          Alex.setQtyDay (14);

               System.out.println(Alex);

     RealEstate home = new RealEstate("Personal", 15000,2012 );
     RealEstate office = new RealEstate("Commercial", 200000,2018);
     Owner owner = new Owner();
     owner.setRealEstate((IRealEstate)home);
     owner.getRealEstate().levelRealEstate(15000);
     owner.setRealEstate((IRealEstate) office);
     owner.getRealEstate().levelRealEstate(200000);
     System.out.print(owner);
    }
}


