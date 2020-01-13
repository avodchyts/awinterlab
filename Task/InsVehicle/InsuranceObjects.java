package com.InsVehicle;

import com.InsHealth.TouristHealth;
import com.Scanner.ScannerInput;
import com.company.MyException;
import java.io.IOException;
import org.apache.log4j.Logger;



import com.InsReal.*;


public class InsuranceObjects {

    private static final Logger LOGGER = Logger.getLogger(InsuranceObjects.class);
    public static AirTransport setProperties(AirTransport airTransport) throws IOException {
        ScannerInput scannerInput = new ScannerInput();
        System.out.println("Enter type vehicle 'jet'");
        String typeVehicle = scannerInput.strInput();
        airTransport.setTypeVehicle(typeVehicle);
        try {
            if (!(typeVehicle == "jet"));
            throw new MyException("Incorrect type of vehicle enter. Please enter 'Jet' type of vehicle" );
        }
        catch (MyException e) {
            e.printStackTrace(System.out);
            LOGGER.error( "Try catch"+ " " + e);
        }

        System.out.println("Enter value of vehicle");
        int valueVehicle = scannerInput.intInput();
        airTransport.setValueVehicle(valueVehicle);

        System.out.println("Enter year of produce");
        int yearProduce = scannerInput.intInput();
        airTransport.setYearProduce(yearProduce);

        System.out.println("Enter length of wings: ");
        int lengthWings = scannerInput.intInput();
        airTransport.setLengthWing(lengthWings);

        System.out.println("Enter type of engine reactive or turboreactive: ");
          String typeEngine = scannerInput.strInput();

        try {
            if (!(typeEngine == "reactive") || !(typeEngine == "turboreactive"));
            throw new MyException("Incorrect type of engine is selected. Please select reactive or turboreactive " );
        }
        catch (MyException e) {
            e.printStackTrace(System.out);
            LOGGER.error( "Try catch"+ " " + e);
        }
        airTransport.setTypeEngine(typeEngine);

        System.out.println("Enter quantity of engine: ");

        int qtyEngine = scannerInput.intInput();
        airTransport.setQtyEngine(qtyEngine);

        System.out.println("Enter size of volume: ");

        int sizeVolume = scannerInput.intInput();
        airTransport.setSizeVolume(sizeVolume);

        return airTransport;
    }
    public static LandTransport setProperties (LandTransport landTransport) throws IOException{
        ScannerInput scannerInput = new ScannerInput();

        System.out.println("Enter type vehicle 'Truck'");
        String typeVehicle = scannerInput.strInput();
        landTransport.setTypeVehicle(typeVehicle);
        try {
            if (!(typeVehicle == "Truck"));
            throw new MyException("Incorrect type of vehicle enter. Please enter 'Truck' type of vehicle" );
        }
        catch (MyException e) {
            e.printStackTrace(System.out);
            LOGGER.error( "Try catch"+ " " + e);
        }

        System.out.println("Enter value of vehicle");
        int valueVehicle = scannerInput.intInput();
        landTransport.setValueVehicle(valueVehicle);

        System.out.println("Enter year of produce");
        int yearProduce = scannerInput.intInput();
        landTransport.setYearProduce(yearProduce);

        System.out.println( "Enter full weight: ");
        int fullWeight = scannerInput.intInput();
        landTransport.setFullWeight(fullWeight);

        System.out.println( "Enter quantity of axises: ");
        int qtyAxis = scannerInput.intInput();
        landTransport.setFullWeight(qtyAxis);

        System.out.println( "Enter name car: ");
        String nameCar = scannerInput.strInput();
        landTransport.setNameCar(nameCar);
        return landTransport;
    }

    public static RailwayTransport setProperties (RailwayTransport railwayTransport) throws IOException{

        ScannerInput scannerInput = new ScannerInput();

        System.out.println("Enter type vehicle 'Train'");
        String typeVehicle = scannerInput.strInput();
        railwayTransport.setTypeVehicle(typeVehicle);
        try {
            if (!(typeVehicle == "Train"));
            throw new MyException("Incorrect type of vehicle enter. Please enter 'Train' type of vehicle" );
        }
        catch (MyException e) {
            e.printStackTrace(System.out);
            LOGGER.error( "Try catch"+ " " + e);
        }

        System.out.println("Enter value of vehicle");
        int valueVehicle = scannerInput.intInput();
        railwayTransport.setValueVehicle(valueVehicle);

        System.out.println("Enter year of produce");
        int yearProduce = scannerInput.intInput();
        railwayTransport.setYearProduce(yearProduce);

        System.out.println("Enter type of train: ");
        String typeTrain = scannerInput.strInput();
        railwayTransport.setTypeTrain(typeTrain);

        System.out.println("Enter quantity of carriages: ");
        int qtyCarriage = scannerInput.intInput();
        railwayTransport.setQtyCarriage(qtyCarriage);

        System.out.println("Enter ma speed: ");
        int maxSpeed =scannerInput.intInput();
        railwayTransport.setMaxSpeed(maxSpeed);

        return railwayTransport;
    }

    public static WaterTransport setProperties (WaterTransport waterTransport) throws IOException{

        ScannerInput scannerInput = new ScannerInput();
        System.out.println("Enter type vehicle 'Ship'");
        String typeVehicle = scannerInput.strInput();
        waterTransport.setTypeVehicle(typeVehicle);
        try {
            if (!(typeVehicle == "Ship"));
            throw new MyException("Incorrect type of vehicle enter. Please enter 'Ship' type of vehicle" );
        }
        catch (MyException e) {
            e.printStackTrace(System.out);
            LOGGER.error( "Try catch"+ " " + e);
        }

        System.out.println("Enter value of vehicle");
        int valueVehicle = scannerInput.intInput();
        waterTransport.setValueVehicle(valueVehicle);

        System.out.println("Enter year of produce");
        int yearProduce = scannerInput.intInput();
        waterTransport.setYearProduce(yearProduce);

        System.out.println("Enter volume of water: ");
        int waterVolum = scannerInput.intInput();
        waterTransport.setWaterVolume(waterVolum);

        System.out.println("Enter power of engine: ");
        int powerEngine = scannerInput.intInput();
        waterTransport.setPowerEngine(powerEngine);

        System.out.println("Enter length of boat: ");
        int lengthBoat = scannerInput.intInput();
        waterTransport.setLengthBoat(lengthBoat);

        return waterTransport;
        }
    public static OwnRealEstate setProperties (OwnRealEstate ownRealEstate) throws IOException{

        ScannerInput scannerInput = new ScannerInput();
        System.out.println("Enter square: ");
        int square = scannerInput.intInput();
        ownRealEstate.setSquare(square);

        System.out.println("Enter quatity of room: ");
        int qtyRoom = scannerInput.intInput();
        ownRealEstate.setQtyRoom(qtyRoom);

        return ownRealEstate;
        }
    public static CommercialRealEstate setProperties(CommercialRealEstate commercialRealEstate) throws IOException{

        ScannerInput scannerInput = new ScannerInput();
        System.out.println("Enter square: ");
        int square = scannerInput.intInput();
        commercialRealEstate.setSquare(square);

        System.out.println("Enter quantity of offices");
        int qtyoffices = scannerInput.intInput();
        commercialRealEstate.setQtyoffices(qtyoffices);

        return commercialRealEstate;
        }

        public static TouristHealth setProperties (TouristHealth touristHealth) throws IOException{

        ScannerInput scannerInput = new ScannerInput();
        System.out.println("Enter country: ");
        String country = scannerInput.strInput();
        touristHealth.setCountry(country);

        System.out.println("Quantity of days: ");
        int qtyDay = scannerInput.intInput();
        touristHealth.setQtyDay(qtyDay);

        return touristHealth;
        }
    }
