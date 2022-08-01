package com.Db.Model;

public class Landtransport {
    private int idLandTransport;
    private int fullWeight;
    private int quantityAxis;
    private String nameCar;
    private int idTransport;

    public void setIdLandTransport(int idLandTransport){
        this.idLandTransport=idLandTransport;
    }

    public int getIdLandTransport() {
        return idLandTransport;
    }

    public void setFullWeight(int fullWeight) {
        this.fullWeight = fullWeight;
    }
    public int getFullWeight() {
        return fullWeight;
    }

    public void setQuantityAxis(int quantityAxis){
        this.quantityAxis = quantityAxis;
    }

    public int getQuantityAxis() {
        return quantityAxis;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setIdTransport(int idTransport){
        this.idTransport=idTransport;
    }

    public int getIdTransport() {
        return idTransport;
    }
public String toString(){return "Landtransport {"+" "+"IdLandtransport ="+idLandTransport+" "+"FullWeight ="+" "+fullWeight+" "+"uantityAxis ="+quantityAxis+" "+"NameCar ="+nameCar+" "+"IdTransport ="+idTransport+"}";
    }
}




