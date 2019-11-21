package com.company;


import com.InsHealth.TouristHealth;
import com.InsReal.CommercialRealEstate;
import com.InsReal.OwnRealEstate;
import com.InsVihcle.AirTransport;
import com.InsVihcle.LandVihcle;
import com.InsVihcle.ReilwayTransport;
import com.InsVihcle.WaterTransport;

public class Execute {
    public static void main(String[] args){
         AirTransport Boeing = new AirTransport();
         Boeing.setVihcle("Jet",10000,2017);
        Boeing.setAirTransport(30,"reactive",2,100);
        Boeing.getVihcle();
        Boeing.getAirTransport();

        System.out.println (Boeing);

      LandVihcle DAF = new LandVihcle();
      DAF.setVihcle("Truck",500,2019);
      DAF.setLandVihcle(50,3,"DAF");
      DAF.getVihcle();
      DAF.getLandVihcle();

      System.out.println(DAF);

      ReilwayTransport Cometa = new ReilwayTransport();
      Cometa.setVihcle("Train",1500,2010);
        Cometa.setReilwayTransport("Electric",5,150);
        Cometa.getVihcle();
        Cometa.getReilwayTransport();

        System.out.println(Cometa);

        WaterTransport Titanic = new WaterTransport();
        Titanic.setVihcle("Ship",1000000,1909);
        Titanic.setWaterTransport(52310,55000,269);
        Titanic.getVihcle();
        Titanic.getWaterTransport();

        System.out.println(Titanic);

        CommercialRealEstate Plaza = new CommercialRealEstate ();
        Plaza.setRealEstate("commercial", 50000,2009);
        Plaza.setCommercialRealEstate(1000,5);
        Plaza.getRealEstate();
        Plaza.getCommercialRealEstate();
        System.out.println(Plaza);

        OwnRealEstate Flat = new OwnRealEstate();
        Flat.setRealEstate("Personal",700,2000);
        Flat.setOwnRealEstate(120,5);
        Flat.getRealEstate();
        Flat.getOwnRealEstate();

        System.out.println(Flat);

        TouristHealth Alex = new TouristHealth();
        Alex.setHealth("Alex",30, "male", "Belarus" );
        Alex.setTouristHealth("Thailand", 14);
        Alex.getHealth();
        Alex.getTouristHealth();

        System.out.println(Alex);

    }
}

