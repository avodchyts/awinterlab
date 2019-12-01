package com.InsVehicle;
public abstract class Vehicle {

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


}
