package com.InsReal;

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

    public OwnRealEstate() {}
      public OwnRealEstate (String typeEstate, int valueEstate, int yearProduce,int square,int qtyRoom ){
      super(typeEstate,valueEstate,yearProduce);
      this.square= square;
      this.qtyRoom= qtyRoom;
  }

    public void setSquare(int square){this.square= square;    }
    public void getSquare (){System.out.println("The square"+ " " + this.square);}

    public void setQtyRoom(int qtyRoom){ this.qtyRoom= qtyRoom; }
    public void getQtyRoom (){System.out.println("Quantity room"+ " " + this.qtyRoom);          }

}
