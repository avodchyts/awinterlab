package com.InsReal;

import java.util.Scanner;

import static com.InsVehicle.IInsuranceCoeff.K2;

public class CommercialRealEstate extends RealEstate implements IRealEstate {
   private int square;
   private int qtyoffices;
  @Override
  public void levelRealEstate(int n ){
            if(n<=1000)
          System.out.println("The level of RealEstate Economy");
      else if(n<=10000)
          System.out.println("The level of RealEstate Standard");
      else
          System.out.println("The level of RealEstate Luxe");
  }
  @Override
  public void levelRealEstate(){
      System.out.println("I use overloading");
  }
  @Override
    public void own(){System.out.println(toString()+" "+ square + " " +qtyoffices); }
   public CommercialRealEstate() {}
   public CommercialRealEstate (String typeEstate, int valueEstate, int yearProduce,int square,int qtyoffices ){
      super(typeEstate,valueEstate,yearProduce);
      this.square= square;
      this.qtyoffices= qtyoffices;
   }

    public void setSquare(int square){this.square= square; }
    public void getSquare (){ System.out.println("The square"+ "" + this.square); }

    public void setQtyoffices(int qtyoffices){ this.qtyoffices= qtyoffices;  }
    public void getQtyoffices (){System.out.println("Quantity Offices"+ "" + this.qtyoffices);
    }
  public static int commercialEstateInsurance (){
        int squarecoeff = 1;
        int qtyofficescoeff = 1;
        int result =1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter square : ");
        int square = in.nextInt();

        switch (square) {
            case 500:
                squarecoeff = 1;
                break;
            case 1000:
                squarecoeff = 2;
                break;
            default:
                squarecoeff = 3;
        }

        System.out.println("Enter quantity of offices");
        int qtyoffices = in.nextInt();

        switch (qtyoffices) {
            case 10:
                qtyofficescoeff = 1;
                break;
            case 15:
                qtyofficescoeff = 2;
                break;
            default:
                qtyofficescoeff = 3;
        }
        result = (squarecoeff + qtyofficescoeff) * K2;
        return result;

  }

}
