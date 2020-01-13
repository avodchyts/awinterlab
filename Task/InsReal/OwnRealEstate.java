package com.InsReal;

import com.Scanner.ScannerInput;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;
import static com.InsVehicle.IInsuranceCoeff.K1;

public class OwnRealEstate extends RealEstate implements IRealEstate {
  private int square;
  private int qtyRoom;
  IRealEstate level;
  private static final Logger LOGGER = Logger.getLogger(OwnRealEstate.class);

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

    public  int personalEstateInsurance () throws IOException {
        int squarecoeff;
        int qtyRommcoeff;
        int result;


        LOGGER.error("Square" + " "+ this.square);

        switch (this.square){
            case 100:
                squarecoeff =1;
                break;
            case 200:
                squarecoeff =2;
                break;
            default:squarecoeff=3;
        }
        LOGGER.error("Quantity rooms" +" "+ this.qtyRoom);

        switch (this.qtyRoom){
            case 4:
                qtyRommcoeff = 1;
            case 7:
                qtyRommcoeff =2;

            default:qtyRommcoeff =3;
        }
        result = (squarecoeff + qtyRommcoeff)*1000*K1;
        LOGGER.error("Result"+ " "+result);
        return result;
    }

  }
