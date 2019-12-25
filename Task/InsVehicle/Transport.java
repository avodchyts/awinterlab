package com.InsVehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Transport {

    protected String typeVehicle;
    protected int valueVehicle;
    protected int yearProduce;


    public abstract void Vehicle(String typeVehicle, int valueVehicle, int yearProduce);

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public void getTypeVehicle() {
        System.out.println("typeVehicle - " + this.typeVehicle);
    }

    public void setValueVehicle(int valueVehicle) {
        this.valueVehicle = valueVehicle;
    }

    public void getValueVehicle() {
        System.out.println("valueVehicle -" + valueVehicle);
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public void getYearProduce() {
        System.out.println("yearProduce - " + yearProduce);
    }

    public static void VehicleInsurance() {
        ArrayList<String> Values = new ArrayList<>();
        Values.add("airtransport");
        Values.add("landtransport");
        Values.add("railwaytransport");
        Values.add("watertransport");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a type of transport: ");
        for (String i:Values){
            System.out.println(i);
        }
        String typeVehicle = in.nextLine().toLowerCase();
        try { Values.get(Values.indexOf(typeVehicle));
        }
        catch (Exception e) {
            System.out.println("Incorrect type of transport selected. Please type from one of the following: ");
            for (String i : Values) {
                System.out.println(i);
            }
        }
        finally { System.out.println("It can be error");

        }
            switch (typeVehicle) {
                case "airtransport" :
                    System.out.println("The cost of insurance for air transport is " + AirTransport.airTransportInsurance()*1000 + "$");
                    break;
                case "landtransport":
                    System.out.println("The cost of insurance for land vehicle is " + LandTransport.landTransportInsurance()*1000 + "$");
                    break;
                case "railwaytransport":
                    System.out.println("The cost of insurance for railway transport is " + RailwayTransport.railwayTransportInsurance()*1000 + "$");
                    break;
                case "watertransport":
                    System.out.println("The cost of insurance for water transport is" + WaterTransport.waterTransportInsurance()*1000 + "$");
                    break;
            }

    }
}


