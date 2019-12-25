package com.InsVehicle;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.company.Execute;

public class AirTransport extends Transport implements IInsuranceCoeff {
    private int lengthWing;
    private String typeEngine;
    private int qtyEngine;
    private int sizeVolume;
    private LinkedList<AirTransport> airTransports = new LinkedList<AirTransport>();

    @Override
    public void Vehicle(String typeVehicle, int valueVehicle, int yearProduce) {
        this.typeVehicle = typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }

    public AirTransport() {
    }

    public AirTransport(int lengthWing, String typeEngine, int qtyEngine, int sizeVolume) {
        this.airTransports = new LinkedList<AirTransport>();
        this.lengthWing = lengthWing;
        this.typeEngine = typeEngine;
        this.qtyEngine = qtyEngine;
        this.sizeVolume = sizeVolume;
    }

    public void addAirTransport(AirTransport airTransport){
        airTransports.add(airTransport);
    }
        public List<AirTransport> getListOfAirTransport(){
             if (airTransports!= null && !airTransports.isEmpty()) {
                  return airTransports;
                    }else{
                         return null;
                    }
             }

    public void setLengthWing(int lengthWing) {
        this.lengthWing = lengthWing;
    }

    public void getLengthWing() {
        System.out.println("The length of wings" + " " + this.lengthWing);
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public void getTypeEngine() {
        System.out.println("The type of engine" + " " + this.typeEngine);
    }

    public void setQtyEngine(int qtyEngine) {
        this.qtyEngine = qtyEngine;
    }

    public void getQtyEngine() {
        System.out.println("The quantity of engines" + " " + this.qtyEngine);
    }

    public void setSizeVolume(int sizeVolume) {
        this.sizeVolume = sizeVolume;
    }

    public void getSizeVolume() {
        System.out.println("Size of volume" + " " + this.sizeVolume);
    }


    public static int airTransportInsurance() {
        int coeflengthWing = 1;
        int coefTypeEngine = 1;
        int coefQtyEngine = 1;
        int coefSizeVolume = 1;
        int result;



        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of wings: 30 or 40 or other ");
        int lengthWing = in.nextInt();
               switch (lengthWing) {
            case 30:
                coeflengthWing = 1;
                break;
            case 40:
                coeflengthWing = 2;
                break;
            default:
                coeflengthWing = 5;
        }

        System.out.print("Enter Type of Engines: reactive or turboreactive ");
            String typeEngine = in.next();
            try {
                if (!(typeEngine == "reactive") || !(typeEngine == "turboreactive"))
                    throw new Exception("Incorrect type of engine is selected. Please select reactive or turboreactive " );
                }catch (Exception e) {
                         System.out.println(e.getMessage());
                    }
        switch (typeEngine) {
            case "reactive":
                coefTypeEngine = 1;
                break;
            case "turboreactive":
                coefTypeEngine = 2;
                break;
            default:
                coefTypeEngine = 3;
        }

        System.out.print("Enter quantity of engines: ");
        int qtyEngine = in.nextInt();

        switch (qtyEngine) {
            case 2:
                coefQtyEngine = 1;
                break;
            case 4:
                coefQtyEngine = 2;
                break;

            default:
                coefQtyEngine = 4;
                ;
        }

        System.out.print("Enter Size Volume: ");
        int sizeVolume = in.nextInt();

        switch (sizeVolume) {
            case 100:
                coefSizeVolume = 1;
                break;
            case 200:
                coefSizeVolume = 2;
                break;
            default:
                coefSizeVolume = 3;
        }
        result = (coeflengthWing + coefTypeEngine + coefQtyEngine + coefSizeVolume) * K5;
        return result;
    }

    @Override
    public void insuranceCoef(int n) {
        System.out.println("Insurance coefficient for air transport:" + "" + K5);
    }

    @Override
    public String toString() {
        return ("Length of wing" + " " + lengthWing + " " + "Type of engine" + " " + typeEngine + " " + "Quantity of engines" + " " + qtyEngine + " " + "Volume size"+ " " + sizeVolume);
    }
}
