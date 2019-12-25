package com.InsVehicle;

import java.io.IOException;
import java.util.ArrayList;
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

    public static void VehicleInsurance() throws IOException {
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
            System.out.println("Incorrect type of transport selected. Please type from one of the following: " + e);
            e.printStackTrace(System.out);
            for (String i : Values) {
                System.out.println(i);
            }
        }
       finally {
            switch (typeVehicle) {
                case "airtransport":
                    AirTransport a = new AirTransport();
                    InsuranceObjects.setProperties(a);
                    System.out.println("The cost of insurance for air transport is " + a.airTransportInsurance() * 10000 + "$");
                    break;
                case "landtransport":
                    LandTransport b = new LandTransport();
                    InsuranceObjects.setProperties(b);
                    System.out.println("The cost of insurance for land vehicle is " + b.landTransportInsurance() * 1000 + "$");
                    break;
                case "railwaytransport":
                    RailwayTransport c = new RailwayTransport();
                    InsuranceObjects.setProperties(c);
                    System.out.println("The cost of insurance for railway transport is " + c.railwayTransportInsurance() * 5000 + "$");
                    break;
                case "watertransport":
                    WaterTransport d = new WaterTransport();
                    InsuranceObjects.setProperties(d);
                    System.out.println("The cost of insurance for water transport is" + d.waterTransportInsurance() * 2000 + "$");
                    break;
            }
        }
    }

}


