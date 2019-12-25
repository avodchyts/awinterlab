package com.InsHealth;

import static com.InsVehicle.IInsuranceCoeff.K7;

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

    public int touristHealthInsurance() {
        int coeffCountry;
        int coeffQtyDay;
        int result;

        switch (this.country) {
            case "Thailand":
                coeffCountry = 1;
                break;
            case "India":
                coeffCountry = 2;
                break;
            default:
                coeffCountry= 5;
        }

        switch (this.qtyDay) {
            case 5:
                coeffQtyDay = 1;
                break;
            case 10:
                coeffQtyDay = 2;
                break;
            case 14:
                coeffQtyDay = 3;
            default:
                coeffQtyDay = 4;
        }

        result = (coeffCountry + coeffQtyDay) * K7;
        return result;
    }
}

