package com.InsVehicle;

public interface IInsuranceCoeff {
    int K1=1; // coefficient for OwnRealEstate
    int K2=2; // coefficient for CommercialRealEstate
    int K3=3; // coefficient for LandTransport
    int K4=4; // coefficient for WaterTransport
    int K5=5; //coefficient for AirTransport
    int K6=6; //coefficient for RailwayTransport
    int K7 =7; ////coefficient for TouristHealth
      public void insuranceCoef(int n);
}
