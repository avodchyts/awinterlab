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

        TouristHealth alex = new TouristHealth();
        alex.setName("Alex");
        alex.setAge(30);
        alex.setSex("male");
        alex.setNationality("Belarus");
        alex.setCountry("Thailand");
        alex.setQtyDay(14);
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

        ArrayList<RealEstate> property = new ArrayList<RealEstate>();
        property.add(flat);
        property.add(townHouse);
        property.add(house);
        property.add(plaza);

        Iterator<RealEstate> p = property.iterator();
        while (p.hasNext()){System.out.println(p.next());
        }

          List<RealEstate> h = Arrays.asList(townHouse, flat, house, plaza);
        //System.out.println(have.get(0));
        for (RealEstate i : h) {
            i.own();
        }

        LinkedList<Transport> v = new LinkedList<Transport>();
        v.add(daf);
        v.add(titanic);
        v.add(boeing);
        v.add(cometa);

        Iterator<Transport> d = v.iterator();
        while( d.hasNext()){System.out.println(d.next());}
        System.out.println();

        Set<RealEstate> tec = new HashSet<RealEstate>();
        tec.add(flat);
        tec.add(house);
        tec.add(plaza);
        tec.add(townHouse);
        tec.add(flat);
        System.out.println(tec);
        System.out.println(tec.contains(house));

        System.out.println();

        Map<Integer,RealEstate> m = new HashMap<Integer, RealEstate>();
        m.put(1, flat);
        m.put(2,townHouse);
        m.put(3,plaza);
        m.put(4,house);
        System.out.println(m);
        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue(plaza));

        System.out.println();

        Queue<String> q = new PriorityQueue<>();
        q.add ("flat");
        q.add("house");
        q.add ("townHouse");
        q.add ("plaza");
        for (String i : q) { System.out.println(i);
        }


            }
}


