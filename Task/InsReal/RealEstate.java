package com.InsReal;

public class RealEstate {
  private String typeEstate;
  private int valueEstate;
  private int yearProduce;
  public RealEstate() { }
  public RealEstate(String typeEstate, int valueEstate, int yearProduce) {
      this.typeEstate = typeEstate;
      this.valueEstate = valueEstate;
      this.yearProduce = yearProduce;
  }
    public void setTypeEstate(String typeEstate){this.typeEstate = typeEstate;}
    public void getTypeEstate() {System.out.println("Type Estate"+ " " + this.typeEstate);}

    public void setValueEstate(int valueEstate){this.valueEstate = valueEstate;}
    public void getValueEstate() {System.out.println("valueEstate"+ " " + this.valueEstate);}

    public void setYearProduce(int yearProduce) { this.yearProduce = yearProduce;  }
    public void getYearProduce() { System.out.println("yearProduce"+ " " + this.yearProduce);  }
}
