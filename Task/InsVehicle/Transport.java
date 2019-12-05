package com.InsVehicle;

import java.util.Scanner;

public abstract class Transport {

    protected String typeVehicle;
    protected int valueVehicle;
    protected int yearProduce;


        public abstract void Vehicle(String typeVehicle, int valueVehicle, int yearProduce );

        public void setTypeVehicle(String typeVehicle) { this.typeVehicle = typeVehicle;  }
        public void getTypeVehicle(){ System.out.println("typeVehicle - " + this.typeVehicle );}

        public void setValueVehicle(int valueVehicle) {this.valueVehicle = valueVehicle;}
        public void getValueVehicle() {System.out.println("valueVehicle -" + valueVehicle );}

        public void setYearProduce (int yearProduce){ this.yearProduce = yearProduce;  }
        public void getYearProduce (){ System.out.println("yearProduce - " + yearProduce);}

 public static  void VehicleInsurance (){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a type of vehicle: ");
    String typeVehicle = in.nextLine();

    switch (typeVehicle){
        case "AirTransport" :
            System.out.println("The cost of insurance for airtransport is " + AirTransport.AirTransportInsurance()+ "$");
            break;
        case "LandTransport":
            System.out.println("The cost of insurance for landvehicle is " + LandTransport.LandVehicleInsurance()+ "$");
            break;
        case "RailwayTransport":
            System.out.println("The cost of insurance for railwaytransport is "+ RailwayTransport.RailwayTransportInsurance()+ "$");
            break;
        case "WaterTransport":
            System.out.println("The cost of insurance for watertransport is" + WaterTransport.WaterTransportInsurance() + "$");
            break;

    }
        }
}


