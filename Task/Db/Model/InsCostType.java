package com.Db.Model;

public class InsCostType {
    private int idInsCost;
    private int insCost;
    private String insType;

    public void setIdInsCost(int idInsCost) {
        this.idInsCost = idInsCost;
    }
    public int getIdInsCost() {
        return idInsCost;
    }

    public void setInsCost(int insCost) {
        insCost = insCost;
    }
    public int getInsCost() {
        return insCost;
    }

    public void setInsType(String insType) {
        this.insType = insType;
    }
    public String getInsType(){
        return insType;
    }
    public String toString(){return "InsCostType {"+" "+"IdInsCost ="+idInsCost+" "+"InsCost ="+insCost+" "+"InsType ="+insType+"}";}
}
