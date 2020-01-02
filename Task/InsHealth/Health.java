package com.InsHealth;

import com.InsReal.CommercialRealEstate;
import com.InsReal.OwnRealEstate;
import com.InsVehicle.InsuranceObjects;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;


public class Health {
  private  String name;
  private  int age;
  private String sex;
  private String nationality;
  private static Logger logger = Logger.getLogger(Health.class);

  public Health() { }
  public Health(String name, int age, String sex, String nationality) {
      this.name = name;
      this.age = age;
      this.sex = sex;
      this.nationality = nationality;
  }

        public void setName(String name) {  this.name = name; }
        public String getName() { return this.name; }

        public void setAge (int age) {  this.age = age;}
        public int getAge() {return this.age ; }

        public void setSex(String sex) { this.sex = sex; }
        public String getSex() { return ("Sex - " + this.sex);}

        public void setNationality(String nationality) {this.nationality = nationality;}
        public String getNationality() {return ("Nationality - " + this.nationality); }

        public String toString(){return"Name" + " " + name + " " + "Age" + " " + age + " " + "Sex" + " " + sex;}

    public static void HealthInsurance() throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a type of health: ");
        logger.debug("Type of health");
        String touristHealth = in.nextLine().toLowerCase();

        TouristHealth g = new TouristHealth();
        InsuranceObjects.setProperties(g);
        System.out.println("The cost of insurance for commercial estate is " + g.touristHealthInsurance()  + "$");

    }
  }

