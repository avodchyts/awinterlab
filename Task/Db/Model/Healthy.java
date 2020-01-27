package com.Db.Model;

public class Healthy {
    private int idHealthy;
    private String typeHealthy;
    private int idInsType;

    public void setIdHealthy(int idHealthy) {
        this.idHealthy = idHealthy;
    }

    public int getIdHealthy() {
        return idHealthy;
    }

    public void setTypeHealthy(String typeHealthy) {
        this.typeHealthy = typeHealthy;
    }

    public String getTypeHealthy() {
        return typeHealthy;
    }

    public void setIdInsType(int idInsType) {
        this.idInsType = idInsType;
    }

    public int getIdInsType() {
        return idInsType;
    }
    public String toString(){
        return "Healthy {"+"IdHealthy ="+idHealthy+" "+"TypeHealthy ="+typeHealthy+" "+"IdInsType ="+getIdInsType()+"}";
    }
}
