package com.InsVehicle;

import java.util.Scanner;

public class RailwayTransport extends Transport implements IInsuranceCoeff {
    private String typeTrain;
    private int qtyCarriage;
    private int maxSpeed;

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

    public static int RailwayTransportInsurance() {
        int coeftypeTrain = 1;
        int coefqtyCarriage = 1;
        int coefmaxSpeed = 1;
        int result;



        Scanner in = new Scanner(System.in);
        System.out.print("Enter type train: ");
        String typeTrain = in.next();

        switch (typeTrain) {
            case "electric":
                coeftypeTrain = 1;
                break;
            case "diesel ":
                coeftypeTrain = 2;
                break;
            default:System.out.println(0);

        }
        System.out.print("Enter quantity carriages: ");
        int qtyCarriage = in.nextInt();
        switch (qtyCarriage) {
            case 10:
                coefqtyCarriage = 1;
                break;
            case 15:
                coefqtyCarriage = 2;
                break;
            case 20:
                coefqtyCarriage = 3;
                break;

            default:System.out.println(0);

        }

        System.out.print("Enter max speed: ");
        int maxSpeed = in.nextInt();

        switch (maxSpeed) {
            case 150:
                coefmaxSpeed = 1;
                break;
            case 175:
                coefmaxSpeed = 2;
                break;
            default:System.out.println(0);
        }


        result = ( coeftypeTrain + coefqtyCarriage + coefmaxSpeed) * K6;

        return result;
    }



    @Override
    public void InsuranceCoef(int n) {
        System.out.println("Insurance coefficient for air transport:"+ "" + K6);
    }
}