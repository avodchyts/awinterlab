package com.InsReal;

import java.util.Scanner;
import static com.InsVehicle.IInsuranceCoeff.K1;

public class OwnRealEstate extends RealEstate implements IRealEstate {
  private int square;
  private int qtyRoom;
  IRealEstate level;


    @Override
    public void levelRealEstate( int n ){
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
      public void own(){System.out.println(toString()+" "+ square + " " +qtyRoom);
      }

    public OwnRealEstate() {}
      public OwnRealEstate (String typeEstate, int valueEstate, int yearProduce,int square,int qtyRoom ){
      super(typeEstate,valueEstate,yearProduce);
      this.square= square;
      this.qtyRoom= qtyRoom;
  }
        public void setSquare(int square){this.square= square; }
        public void getSquare (){System.out.println("The square"+ " " + this.square);}

        public void setQtyRoom(int qtyRoom){ this.qtyRoom= qtyRoom; }
        public void getQtyRoom (){System.out.println("Quantity room"+ " " + this.qtyRoom);          }

    public  int personalEstateInsurance (){
        int squarecoeff;
        int qtyRommcoeff;
        int result;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter square : ");
        int square = in.nextInt();
        switch (this.square){
            case 100:
                squarecoeff =1;
                break;
            case 200:
                squarecoeff =2;
                break;
            default:squarecoeff=3;
        }

        System.out.println("Enter quantity rooms : ");
        int qtyRoom = in.nextInt();
        switch (this.qtyRoom){
            case 4:
                qtyRommcoeff = 1;
            case 7:
                qtyRommcoeff =2;

            default:qtyRommcoeff =3;
        }
        result = (squarecoeff + qtyRommcoeff)*K1;
        return result;
    }

  }
