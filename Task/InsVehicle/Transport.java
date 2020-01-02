package com.InsVehicle;

import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public abstract class Transport {

    protected String typeVehicle;
    protected int valueVehicle;
    protected int yearProduce;
    private static Logger logger = Logger.getLogger(Transport.class);

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

        Properties properties = new Properties();
        properties.load(new FileReader("C:/Users/user/Desktop/InsCompanyMaven/src/main/resources/data.properties"));

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a type of transport: ");
        for(String key:properties.stringPropertyNames()){
         System.out.println(properties.get(key));

        }

        String typeVehicle = in.nextLine().toLowerCase();
       try {properties.load(new FileReader("C:/Users/user/Desktop/InsCompanyMaven/src/main/resources/data.properties"));
       }

        catch (Exception e) {
            System.out.println("Incorrect type of transport selected. Please type from one of the following: " + e);
            e.printStackTrace(System.out);
            logger.error("Try catch" + " " + e);

             for (String key : properties.stringPropertyNames()) {
                System.out.println(properties.get(key));
            }
        }

        finally {
            logger.debug("Type vehicle" + " "+ typeVehicle);
            switch (typeVehicle) {
                case "airtransport":
                    AirTransport a = new AirTransport();
                    InsuranceObjects.setProperties(a);
                    System.out.println("The cost of insurance for air transport is " + a.airTransportInsurance()  + "$");
                    break;
                case "landtransport":
                    LandTransport b = new LandTransport();
                    InsuranceObjects.setProperties(b);
                    System.out.println("The cost of insurance for land vehicle is " + b.landTransportInsurance()  + "$");
                    break;
                case "railwaytransport":
                    RailwayTransport c = new RailwayTransport();
                    InsuranceObjects.setProperties(c);
                    System.out.println("The cost of insurance for railway transport is " + c.railwayTransportInsurance() + "$");
                    break;
                case "watertransport":
                    WaterTransport d = new WaterTransport();
                    InsuranceObjects.setProperties(d);
                    System.out.println("The cost of insurance for water transport is" + d.waterTransportInsurance()  + "$");
                    break;
            }
        }
    }

}


