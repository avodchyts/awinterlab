package com.InsHealth;

public class TouristHealth extends Health {
  private String country;
  private int qtyDay;

    public TouristHealth() {}
     public  TouristHealth (String name, int age, String sex, String nationality, String country, int qtyDay ){
      super(name, age, sex, nationality);
      this.country= country;
      this.qtyDay= qtyDay;
  }

    public void setCountry(String country){this.country= country;  }
    public void getCountry (){System.out.println("The country"+ " " + this.country);    }

    public void setQtyDay(int qtyDay){this.qtyDay= qtyDay;  }
    public void getQtyDay (){System.out.println("Quantity days"+ " " + this.qtyDay);  }

    @Override
    public String toString(){return "Name"+  " " + "Country" + " " + country + " " + "Quantity days" + " " + qtyDay;}
}
