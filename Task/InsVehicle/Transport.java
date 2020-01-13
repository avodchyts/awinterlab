package com.InsVehicle;

import com.Scanner.ScannerInput;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

import com.Parser.FileParser;


public abstract class Transport {

    protected String typeVehicle;
    protected int valueVehicle;
    protected int yearProduce;
    private static final Logger LOGGER = Logger.getLogger(Transport.class);
    public static FileInputStream getFileInputStream (File file) throws FileNotFoundException{
        return new FileInputStream(file);
    }

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
        try {
            FileInputStream file = new FileInputStream("C:/Users/user/Desktop/InsCompanyMaven/src/main/resources/data.properties");
            Properties properties = new Properties();
            properties.load(file);

            ScannerInput in = new ScannerInput();

            System.out.println("Enter a type of transport: ");
          for (String key : properties.stringPropertyNames()) {
                System.out.println(properties.get(key));
            }

            String typeVehicle = in.strInput().toLowerCase();
            try {
                properties.load(new FileInputStream("C:/Users/user/Desktop/InsCompanyMaven/src/main/resources/data.properties"));
            } catch (IOException e) {
                System.out.println("Incorrect type of transport selected. Please type from one of the following: " + e);
                e.printStackTrace(System.out);
                LOGGER.error("Try catch" + " " + e);

              } finally {
                LOGGER.debug("Type vehicle" + " " + typeVehicle);
                switch (typeVehicle) {
                    case "airtransport":
                        AirTransport airTransport = new AirTransport();
                        InsuranceObjects.setProperties(airTransport);
                        System.out.println("The cost of insurance for air transport is " + airTransport.airTransportInsurance() + "$");
                        break;
                    case "landtransport":
                        LandTransport landTransport = new LandTransport();
                        InsuranceObjects.setProperties(landTransport);
                        System.out.println("The cost of insurance for land vehicle is " + landTransport.landTransportInsurance() + "$");
                        break;
                    case "railwaytransport":
                        RailwayTransport railwayTransport = new RailwayTransport();
                        InsuranceObjects.setProperties(railwayTransport);
                        System.out.println("The cost of insurance for railway transport is " + railwayTransport.railwayTransportInsurance() + "$");
                        break;
                    case "watertransport":
                        WaterTransport waterTransport = new WaterTransport();
                        InsuranceObjects.setProperties(waterTransport);
                        System.out.println("The cost of insurance for water transport is" + waterTransport.waterTransportInsurance() + "$");
                        break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            LOGGER.error(ex);
        }
    }
}


