package com.company;

import com.InsHealth.TouristHealth;
import com.InsReal.CommercialRealEstate;
import com.InsReal.IRealEstate;
import com.InsReal.OwnRealEstate;
import com.InsReal.RealEstate;
import com.InsVehicle.*;

import java.util.*;

public final class Execute {

    public static void main(String[] args) {
AirTransport boeing = new AirTransport();
        boeing.setTypeVehicle("Jet");
        boeing.setValueVehicle(10000);
        boeing.setYearProduce(2017);
        boeing.setLengthWing(30);
        boeing.setTypeEngine("reactive");
        boeing.setQtyEngine(2);
        boeing.setSizeVolume(100);

        boeing.getTypeVehicle();
        boeing.getValueVehicle();
        boeing.getYearProduce();
        boeing.getLengthWing();
        boeing.getTypeEngine();
        boeing.getQtyEngine();
        boeing.getSizeVolume();
        System.out.println(boeing);
        System.out.println();

        AirTransport il = new AirTransport();
        il.setTypeVehicle("Jet");
        il.setValueVehicle(1000);
        il.setYearProduce(2000);
        il.setLengthWing(40);
        il.setTypeEngine("turboreactive");
        il.setQtyEngine(4);
        il.setSizeVolume(200);

        il.getTypeVehicle();
        il.getValueVehicle();
        il.getYearProduce();
        il.getLengthWing();
        il.getTypeEngine();
        il.getQtyEngine();
        il.getSizeVolume();
        System.out.println(il);

        System.out.println();

LinkedList<AirTransport> airTransports = new LinkedList<AirTransport>();
    airTransports.add(boeing);
    airTransports.add(il);
        for (AirTransport i : airTransports) {
            i.getListOfAirTransport();}
        Iterator<AirTransport> a = airTransports.iterator();
        while( a.hasNext()){System.out.println(a.next());}


        System.out.println();

      LandTransport daf = new LandTransport();
        daf.setTypeVehicle("Truck");
        daf.setValueVehicle(500);
        daf.setYearProduce(2019);
        daf.setFullWeight(50);
        daf.setQtyAxis(3);
        daf.setNameCar("DAF");

        daf.getTypeVehicle();
        daf.getValueVehicle();
        daf.getYearProduce();
        daf.getFullWeight();
        daf.getQtyAxis();
        daf.getNameCar();
        System.out.println(daf);

        System.out.println();

      LandTransport volvo = new LandTransport();
        volvo.setTypeVehicle("Truck");
        volvo.setValueVehicle(400);
        volvo.setYearProduce(2017);
        volvo.setFullWeight(60);
        volvo.setQtyAxis(4);
        volvo.setNameCar("VOLVO");

        volvo.getTypeVehicle();
        volvo.getValueVehicle();
        volvo.getYearProduce();
        volvo.getFullWeight();
        volvo.getQtyAxis();
        volvo.getNameCar();

        System.out.println();


            ArrayList<LandTransport> landTransports = new ArrayList<LandTransport>();
            landTransports.add(daf);
            landTransports.add(volvo);



 Iterator<LandTransport> c = landTransports.iterator();
        while( c.hasNext()){System.out.println(c.next());}


        System.out.println();

 RailwayTransport cometa = new RailwayTransport();
        cometa.setTypeVehicle("Train");
        cometa.setValueVehicle(1500);
        cometa.setYearProduce(2010);
        cometa.setTypeTrain("Electric");
        cometa.setQtyCarriage(5);
        cometa.setMaxSpeed(150);

        cometa.getTypeVehicle();
        cometa.getValueVehicle();
        cometa.getYearProduce();
        cometa.getTypeTrain();
        cometa.getQtyCarriage();
        cometa.getMaxSpeed();
        System.out.println(cometa);

        System.out.println();

        WaterTransport titanic = new WaterTransport();
        titanic.setTypeVehicle("Ship");
        titanic.setValueVehicle(1000000);
        titanic.setYearProduce(1909);
        titanic.setWaterVolume(52310);
        titanic.setPowerEngine(55000);
        titanic.setLengthBoat(269);

        titanic.getTypeVehicle();
        titanic.getValueVehicle();
        titanic.getYearProduce();
        titanic.getWaterVolume();
        titanic.getPowerEngine();
        titanic.getLengthBoat();
        System.out.println(titanic);

        System.out.println();

        WaterTransport dream = new WaterTransport();
        dream.setTypeVehicle("Ship");
        dream.setValueVehicle(10000);
        dream.setYearProduce(2009);
        dream.setWaterVolume(5310);
        dream.setPowerEngine(5000);
        dream.setLengthBoat(29);

        dream.getTypeVehicle();
        dream.getValueVehicle();
        dream.getYearProduce();
        dream.getWaterVolume();
        dream.getPowerEngine();
        dream.getLengthBoat();
        System.out.println(dream);

        System.out.println();

        Set<WaterTransport> waterTransports = new HashSet<WaterTransport>();
        waterTransports.add(titanic);
        waterTransports.add(dream);
        waterTransports.add(titanic);

        Iterator<WaterTransport> d = waterTransports.iterator();
        while( d.hasNext()){System.out.println(d.next());}
        System.out.println(waterTransports);
        System.out.println(waterTransports.contains(dream));

        System.out.println();


    Transport.VehicleInsurance();


       System.out.println();

        RealEstate plaza = new CommercialRealEstate();
        plaza.setTypeEstate("Commercial");
        plaza.setValueEstate(50000);
        plaza.setYearProduce(2009);
        ((CommercialRealEstate) plaza).setSquare(1000);
        ((CommercialRealEstate) plaza).setQtyoffices(5);

        plaza.getTypeEstate();
        plaza.getValueEstate();
        plaza.getYearProduce();
        ((CommercialRealEstate) plaza).getSquare();
        ((CommercialRealEstate) plaza).getQtyoffices();
        ((CommercialRealEstate) plaza).levelRealEstate(11000);
        ((CommercialRealEstate) plaza).levelRealEstate();
        System.out.println(plaza);

        System.out.println();

        RealEstate flat = new OwnRealEstate();
        flat.setTypeEstate("Personal");
        flat.setValueEstate(1000);
        flat.setYearProduce(2000);
        ((OwnRealEstate) flat).setSquare(120);
        ((OwnRealEstate) flat).setQtyRoom(5);

        flat.getTypeEstate();
        flat.getValueEstate();
        flat.getYearProduce();
        ((OwnRealEstate) flat).getSquare();
        ((OwnRealEstate) flat).getQtyRoom();
        ((OwnRealEstate) flat).levelRealEstate(1000);
        ((OwnRealEstate) flat).levelRealEstate();
        System.out.println(flat);

        System.out.println();

        RealEstate house = new OwnRealEstate();
        house.setTypeEstate("Personal");
        house.setValueEstate(2000);
        house.setYearProduce(2010);
        ((OwnRealEstate) house).setSquare(240);
        ((OwnRealEstate) house).setQtyRoom(8);

        house.getTypeEstate();
        house.getValueEstate();
        house.getYearProduce();
        ((OwnRealEstate) house).getSquare();
        ((OwnRealEstate) house).getQtyRoom();
        ((OwnRealEstate) house).levelRealEstate(2000);
        ((OwnRealEstate) house).levelRealEstate();
        System.out.println(house);

        System.out.println();

        RealEstate townHouse = new RealEstate();
        townHouse.setTypeEstate("Personal");
        townHouse.setValueEstate(11000);
        townHouse.setYearProduce(2010);
        townHouse.getTypeEstate();
        townHouse.getValueEstate();
        townHouse.getYearProduce();
        System.out.println(townHouse);

        System.out.println();


        HashMap<Integer, RealEstate> realEstates = new HashMap<Integer, RealEstate>();
            realEstates.put(1, house);
            realEstates.put(2, townHouse);
            realEstates.put(3, house);
            realEstates.put(4, plaza);
            realEstates.put(5, flat);
            realEstates.put(6, house);
          try {  realEstates.containsKey(7);
        } catch (Exception e){System.out.println("Error");}

        System.out.println();

        Queue<RealEstate> properties = new PriorityQueue<RealEstate>();
        properties.add(house);
        properties.add(flat);
        properties.add(townHouse);
        properties.add(plaza);
        System.out.println(properties);

        System.out.println();
        RealEstate.RealInsurance();
        System.out.println();

        TouristHealth alex = new TouristHealth();
        alex.setName("Alex");
        alex.setAge(30);
        alex.setSex("male");
        alex.setNationality("Belarus");
        alex.setCountry("Thailand");
        alex.setQtyDay(14);

        alex.getName();
        alex.getAge();
        alex.getSex();
        alex.getNationality();
        alex.getCountry();
        alex.getQtyDay();
        System.out.println(alex);

        System.out.println();

        IRealEstate realEstate = new OwnRealEstate();
        ((OwnRealEstate) realEstate).setSquare(500);
        ((OwnRealEstate) realEstate).setQtyRoom(5);
        realEstate.levelRealEstate(500);
        ((OwnRealEstate) realEstate).getQtyRoom();
        ((OwnRealEstate) realEstate).getSquare();

         realEstate = new CommercialRealEstate();
        ((CommercialRealEstate) realEstate).setSquare(2000);
        ((CommercialRealEstate) realEstate).setQtyoffices(12);
        realEstate.levelRealEstate(2000);
        ((CommercialRealEstate) realEstate).getSquare();
        ((CommercialRealEstate) realEstate).getQtyoffices();
        System.out.print(realEstate);

        System.out.println();





    }
}


