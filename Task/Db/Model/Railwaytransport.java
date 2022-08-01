package com.Db.Model;

public class Railwaytransport {
    private int idRealwaytransport;
    private String typeTrain;
    private int QuantityCarriage;
    private int maxSpeed;
    private int idTransport;

    public void setIdRealwaytransport(int idRealwaytransport) {
        this.idRealwaytransport = idRealwaytransport;
    }

    public int getIdRealwaytransport() {
        return idRealwaytransport;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public String getTypeTrain() {
        return typeTrain;
    }

    public void setQuantityCarriage(int uantityCarriage) {
        this.QuantityCarriage = uantityCarriage;
    }

    public int getQuantityCarriage() {
        return QuantityCarriage;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setIdTransport(int idTransport) {
        this.idTransport = idTransport;
    }

    public int getIdTransport() {
        return idTransport;
    }

    public String toString(){return "Railwaytransport{"+" "+"IdRailwaytransport ="+idRealwaytransport+" "+"TypeTrain ="+typeTrain+" "+"QuantityCarriage ="+getQuantityCarriage()+" "+"MaxSpeed ="+maxSpeed+" }";}
}
