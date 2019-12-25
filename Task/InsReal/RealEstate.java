package com.InsReal;

import com.InsVehicle.AirTransport;
import com.InsVehicle.InsuranceObjects;

import java.io.IOException;
import java.util.*;
import java.util.Comparator;

public class RealEstate<realEstate> implements Comparable<RealEstate> {
  private String typeEstate;
  private int valueEstate;
  private int yearProduce;
  private Map<Integer, String> realEstates = new HashMap<Integer, String>();
  private Queue<RealEstate> properties = new PriorityQueue<RealEstate>();


  public RealEstate() {
  }

  public RealEstate(String typeEstate, int valueEstate, int yearProduce) {
    this.properties = new PriorityQueue<RealEstate>();
    this.realEstates = new HashMap<Integer, String>();
    this.typeEstate = typeEstate;
    this.valueEstate = valueEstate;
    this.yearProduce = yearProduce;
  }


  public Queue<RealEstate> addProperties(RealEstate property) {
    properties.add(property);
    return properties;
  }

  public String getProperties() {return getProperties();
  }

  public Map<Integer, String> addRealEstates(int index, String realEstate) {
    realEstates.put(index, realEstate);
    return realEstates;
  }

  public String getRealEstates() {
    return getRealEstates();
  }

  public void setTypeEstate(String typeEstate) {
    this.typeEstate = typeEstate;
  }

  public void getTypeEstate() {
    System.out.println("Type Estate" + " " + this.typeEstate);
  }

  public void setValueEstate(int valueEstate) {
    this.valueEstate = valueEstate;
  }

  public void getValueEstate() {
    System.out.println("valueEstate" + " " + this.valueEstate);
  }

  public void setYearProduce(int yearProduce) {
    this.yearProduce = yearProduce;
  }

  public void getYearProduce() {
    System.out.println("yearProduce" + " " + this.yearProduce);
  }

  public static void RealInsurance() throws IOException {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a type of estate: Commercial or Personal ");
    String typeEstate = in.nextLine().toLowerCase();

    switch (typeEstate){
      case "commercial":
        CommercialRealEstate e = new CommercialRealEstate();
        InsuranceObjects.setProperties(e);
      System.out.println("The cost of insurance for commercial estate is " + e.commercialEstateInsurance()*10000 + "$");
        break;
      case "personal":
        OwnRealEstate f = new OwnRealEstate();
        InsuranceObjects.setProperties(f);
        System.out.println("The cost of insurance for personal estate is " + f.personalEstateInsurance()*1000 + "$");
        break;
    }

  }

  public void own() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return ("I have :" + typeEstate + " " + valueEstate + " " + yearProduce);
  }

  @Override
  public int compareTo(RealEstate anotherRealEstate) {
    if (this.valueEstate == anotherRealEstate.valueEstate) {
      return 0;
        } else if (this.valueEstate < anotherRealEstate.valueEstate) {
         return -1;
          } else {
             return 1;
    }
  }
}