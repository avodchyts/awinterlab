package com.InsReal;

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
    this.properties = new PriorityQueue<>();
    this.realEstates = new HashMap<Integer, String>();
    this.typeEstate = typeEstate;
    this.valueEstate = valueEstate;
    this.yearProduce = yearProduce;
  }


  public Queue<RealEstate> addProperties(RealEstate property) {
    properties.add(property);
    return properties;
  }

  public String getProperties() {
    return getProperties();
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