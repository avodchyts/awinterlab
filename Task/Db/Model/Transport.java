package com.Db.Model;

public class Transport {
    private int idTransport;
    private int typeVechicle;
    private int idInsType;

    public void setIdTransport(int idTransport) {
        this.idTransport = idTransport;
    }

    public int getIdTransport() {
        return idTransport;
    }

    public void setTypeVechicle(int typeVechicle) {
        this.typeVechicle = typeVechicle;
    }

    public int getTypeVechicle() {
        return typeVechicle;
    }
    public String toString(){
        return "Transport{"+" "+"idTransport ="+idTransport+" "+"typeTransport ="+typeVechicle+" "+"idInsType ="+"}";
    }
}
