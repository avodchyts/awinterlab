package com.InsVehicle;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class RailwayTransport extends Transport implements IInsuranceCoeff {
    private String typeTrain;
    private int qtyCarriage;
    private int maxSpeed;
    private static final Logger LOGGER = Logger.getLogger(RailwayTransport.class);


    @Override
    public void Vehicle(String typeVehicle, int valueVehicle, int yearProduce) {
        this.typeVehicle = typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }

    public RailwayTransport() {
    }

    public RailwayTransport(String typeTrain, int qtyCarriage, int maxSpeed) {
        this.typeTrain = typeTrain;
        this.qtyCarriage = qtyCarriage;
        this.maxSpeed = maxSpeed;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public void getTypeTrain() {
        System.out.println("Type of train" + " " + this.typeTrain);
    }

    public void setQtyCarriage(int qtyCarriage) {
        this.qtyCarriage = qtyCarriage;
    }

    public void getQtyCarriage() {
        System.out.println("Quantity of carriage" + " " + this.qtyCarriage);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void getMaxSpeed() {
        System.out.println("Max speed " + " " + this.maxSpeed);
    }

    public int railwayTransportInsurance() {
        int coeftypeTrain = 1;
        int coefqtyCarriage = 1;
        int coefmaxSpeed = 1;
        int result;


        LOGGER.debug("Type of train" + " "+this.typeTrain);

        switch (this.typeTrain) {
            case "electric":
                coeftypeTrain = 1;
                break;
            case "diesel ":
                coeftypeTrain = 2;
                break;
            default:coeftypeTrain = 3;

        }
        LOGGER.debug("Quantity carriages" + " "+ this.qtyCarriage);


        switch (this.qtyCarriage) {
            case 10:
                coefqtyCarriage = 1;
                break;
            case 15:
                coefqtyCarriage = 2;
                break;
            case 20:
                coefqtyCarriage = 3;
                break;

            default:
                coefqtyCarriage = 4;

        }
        LOGGER.debug("Max speed" + " "+ this.maxSpeed);


        switch (this.maxSpeed) {
            case 150:
                coefmaxSpeed = 1;
                break;
            case 175:
                coefmaxSpeed = 2;
                break;
            default:
                coefmaxSpeed = 2;
        }


        result = ( coeftypeTrain + coefqtyCarriage + coefmaxSpeed)*1000 * K6;
        LOGGER.debug("Result" + " "+ result);
        return result;
    }



    @Override
    public void insuranceCoef(int n) {
        System.out.println("Insurance coefficient for railway transport:"+ "" + K6);
    }
}