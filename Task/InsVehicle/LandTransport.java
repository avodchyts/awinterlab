package com.InsVehicle;

import java.util.Scanner;

public class LandTransport extends Vehicle {
    private int fullWeight;
    private int qtyAxis;
    private String nameCar;

    @Override
    public void Vehicle(String typeVehicle, int valueVehicle, int yearProduce) {
        this.typeVehicle = typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }

    public LandTransport() {
    }

    public LandTransport(int fullWeight, int qtyAxis, String nameCar) {
        this.fullWeight = fullWeight;
        this.qtyAxis = qtyAxis;
        this.nameCar = nameCar;
    }

    public void setFullWeight(int fullWeight) {
        this.fullWeight = fullWeight;
    }

    public void getFullWeight() {
        System.out.println("Full weight" + " " + this.fullWeight);
    }

    public void setQtyAxis(int qtyAxis) {
        this.qtyAxis = qtyAxis;
        ;
    }

    public void getQtyAxis() {
        System.out.println("Quantity Axis" + " " + qtyAxis);
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void getNameCar() {
        System.out.println("Name Car" + " " + nameCar);
    }

    public static int LandVehicleInsurance() {
        int coeffullWeight = 1;
        int coefqtyAxis = 1;
        int coefnameCar = 1;
        final int k =3; // insurance coefficient
        int result;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter full weight: ");
        int fullWeight = in.nextInt();

        switch (fullWeight) {
            case 30:
                coeffullWeight = 1;
                break;
            case 40:
                coeffullWeight = 2;
                break;
            case 50:
                coeffullWeight = 3;
                break;

        }
         System.out.print("Enter quantity axis: ");
        int qtyAxis = in.nextInt();
        switch (qtyAxis) {
            case 2:
                coefqtyAxis = 1;
                break;
            case 3:
                coeffullWeight = 2;
                break;
            case 4:
                coeffullWeight = 3;
                break;

        }

        System.out.print("Enter name car: ");
        String nameCar = in.next();

        switch (nameCar) {
            case "DAF":
                coefnameCar = 1;
                break;
            case "Volvo":
                coefnameCar = 2;
                break;
        }


        result = (coeffullWeight + coefqtyAxis + coefnameCar) * k;
        return result;
    }
}
