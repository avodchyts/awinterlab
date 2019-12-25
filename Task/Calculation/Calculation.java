package com.Calculation;

import com.InsHealth.Health;
import com.InsReal.RealEstate;
import com.InsVehicle.*;
import com.Scanner.ScannerInput;

import java.io.IOException;
import java.util.ArrayList;

public class Calculation {
    public static void InsuranceCalculation() throws IOException {
        ArrayList<String> typeInsurances = new ArrayList<String>();
        typeInsurances.add("Transport");
        typeInsurances.add("RealEstate");
        typeInsurances.add("Health");

        ScannerInput scannerInput = new ScannerInput();
        System.out.println("Enter a type of insurance: ");
        for (String i:typeInsurances){
            System.out.println(i);
        }

        String str = scannerInput.strInput();
        switch (str) {
            case "Transport" :
               Transport.VehicleInsurance();
                break;
            case "RealEstate":
                RealEstate.RealInsurance();
                break;
            case "Health":
                Health.HealthInsurance();
                break;
            default: System.out.println ("You calculated values of insurance ");
        }
    }
}
