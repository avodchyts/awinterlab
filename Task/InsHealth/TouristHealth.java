package com.InsHealth;

import org.apache.log4j.Logger;

import static com.InsVehicle.IInsuranceCoeff.K7;

public class TouristHealth extends Health {
  private String country;
  private int qtyDay;
  private static Logger logger = Logger.getLogger(TouristHealth.class);

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
        logger.debug("Country" + this.country);
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
         logger.debug("Quantity days"+ " "+ this.qtyDay);
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

        result = (coeffCountry + coeffQtyDay)*1000 * K7;
        logger.debug("Result" +" "+result);
        return result;
    }
}

