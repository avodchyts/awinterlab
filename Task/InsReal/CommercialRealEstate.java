package com.InsReal;

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
}
