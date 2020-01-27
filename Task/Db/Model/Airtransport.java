package com.Db.Model;

import java.sql.Connection;
import java.util.List;

public class Airtransport {
    private String airtransport;
    //private int valueVehicle;
   // private int yearProduce;
    private int lengthWing;
    private String typeEngine;
    private int quantityEngine;
    private int sizeVolume;
    private int idAirtransport;
    private int idTransport;

    public void setAirtransport(String airtransport) {
        this.airtransport = airtransport;
    }
    public String getAirtransport(){
        return airtransport;
    }

  /*  public void setValueVehicle(int valueVehicle){
        this.valueVehicle= valueVehicle;
    }
    public int getValueVehicle() {
        return valueVehicle;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public int getYearProduce() {
        return yearProduce;
    }*/

    public void setLengthWing(int lengthWing) {
        this.lengthWing = lengthWing;
    }

    public int getLengthWing()
    {
        return lengthWing;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setQuantityEngine(int quantityEngine) {
        this.quantityEngine = quantityEngine;
    }
    public int getQuantityEngine() {
         return quantityEngine;
    }

    public void setSizeVolume(int sizeVolume) {
        this.sizeVolume = sizeVolume;
    }

    public int getSizeVolume() {
        return sizeVolume;
    }

    public void setIdAirtransport (int idAirtransport){
        this.idAirtransport= idAirtransport;
    }
    public int getIdAirtransport() {
        return idAirtransport;
    }

    public void setIdTransport (int idTransport){
        this.idTransport= idTransport;
    }
    public int getIdTransport() {
        return idTransport;
    }

    public List<Connection> getConnections(List<Connection> connections) {
        return connections;
    }

    public String toString (){return "Airtransport {" +"IdAirTransport ="+" "+ idAirtransport+" "+"Airtransport="+airtransport+" "+"LengthWing="+lengthWing+" "+"TypeEngine="+typeEngine+" "+"QuantityEngine="+quantityEngine+" "+"SizeVolume="+sizeVolume+" "+"IdTransport ="+idTransport+" "+"}"; }


}



