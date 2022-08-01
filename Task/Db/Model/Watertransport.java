package com.Db.Model;

public class Watertransport {
    private int idwatertransport;
    private int waterValume;
    private int powerEngine;
    private int lengthBoat;
    private int idTranaport;

    public void setIdwatertransport(int idwatertransport) {
        this.idwatertransport = idwatertransport;
    }

    public int getIdwatertransport() {
        return idwatertransport;
    }

    public void setWaterValume(int waterValume) {
        this.waterValume = waterValume;
    }

    public int getWaterValume() {
        return waterValume;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setLengthBoat(int lengthBoat) {
        this.lengthBoat = lengthBoat;
    }

    public int getLengthBoat() {
        return lengthBoat;
    }

    public void setIdTranaport(int idTranaport) {
        this.idTranaport = idTranaport;
    }

    public int getIdTranaport() {
        return idTranaport;
    }

    public String toString(){return "Watertransport {"+" "+"IdWatertransport ="+idwatertransport+" "+"WaterVolume ="+waterValume+" "+"PowerEngine ="+powerEngine+" "+"lengthBoat ="+lengthBoat+" "+"IdTransport ="+idTranaport+"}";}
}
