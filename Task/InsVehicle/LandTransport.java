package com.InsVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LandTransport extends Transport implements IInsuranceCoeff {
    private int fullWeight;
    private int qtyAxis;
    private String nameCar;
    private ArrayList<LandTransport> landTransports = new ArrayList<LandTransport>();

    @Override
    public void Vehicle(String typeVehicle, int valueVehicle, int yearProduce) {
        this.typeVehicle = typeVehicle;
        this.valueVehicle = valueVehicle;
        this.yearProduce = yearProduce;
    }

    public LandTransport() {
    }

    public LandTransport(int fullWeight, int qtyAxis, String nameCar) {
        this.landTransports= new ArrayList<LandTransport>();
        this.fullWeight = fullWeight;
        this.qtyAxis = qtyAxis;
        this.nameCar = nameCar;
    }

    public ArrayList<LandTransport> addLandTransport(LandTransport landTransport) {
        landTransports.add(landTransport);
    return landTransports;}
       List<LandTransport> getListOfLandTransport() {

           if (landTransports != null && !landTransports.isEmpty()) {
               return landTransports;
           } else {
               return null;
           }
       }


        public void setFullWeight ( int fullWeight){
            this.fullWeight = fullWeight;
        }

        public void getFullWeight () {
            System.out.println("Full weight" + " " + fullWeight);
        }

        public void setQtyAxis ( int qtyAxis){
            this.qtyAxis = qtyAxis;
        }

        public void getQtyAxis () {
            System.out.println("Quantity Axis" + " " + qtyAxis);
        }

        public void setNameCar (String nameCar){
            this.nameCar = nameCar;
        }

        public void getNameCar () {
            System.out.println("Name Car" + " " + nameCar);
        }

        public int landTransportInsurance () {
            int coeffullWeight = 1;
            int coefqtyAxis = 1;
            int coefnameCar = 1;
            int result = 1;


            Scanner in = new Scanner(System.in);
            System.out.print("Enter full weight: ");
            int fullWeight = in.nextInt();

            switch (this.fullWeight) {
                case 30:
                    coeffullWeight = 1;
                    break;
                case 40:
                    coeffullWeight = 2;
                    break;
                case 50:
                    coeffullWeight = 3;
                    break;
                default:
                    coeffullWeight = 4;

            }
            System.out.print("Enter quantity axis: ");
            int qtyAxis = in.nextInt();
            switch (this.qtyAxis) {
                case 2:
                    coefqtyAxis = 1;
                    break;
                case 3:
                    coeffullWeight = 2;
                    break;
                case 4:
                    coeffullWeight = 3;
                    break;
                default:
                    coeffullWeight = 4;

            }

            System.out.print("Enter name car: ");
            String nameCar = in.next();

            switch (this.nameCar) {
                case "DAF":
                    coefnameCar = 1;
                    break;
                case "Volvo":
                    coefnameCar = 2;
                    break;

                default:
                    coefnameCar = 3;
            }


            result = (coeffullWeight + coefqtyAxis + coefnameCar) * K3;
            return result;

        }
       @Override
        public String toString () {
            return ("Full weight" + " " + fullWeight +" "+ "Quantity Axis" + " " + qtyAxis + " " +"Name Car" + " " + nameCar + " " + "Type Vehicle" + " " + typeVehicle + " " + "Value vehicle" + " " + valueVehicle + " " + "Year produce"+ " " + yearProduce);
        }

        @Override
        public void insuranceCoef ( int n){
            System.out.println("Insurance coefficient for air transport:" + " " + K3);
        }
    }
