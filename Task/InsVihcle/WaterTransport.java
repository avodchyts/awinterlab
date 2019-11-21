package com.InsVihcle;

public class WaterTransport extends Vihcle {
    private int waterVolume;
    private int powerEngine;
    private int lengthBoat;
    public WaterTransport () {}
        public WaterTransport (String typeVihcle, int valueVihcle,int yearProduce,int waterVolume, int powerEngine, int lengthBoat){
        super(typeVihcle,valueVihcle,yearProduce);
        this.waterVolume = waterVolume;
        this.powerEngine = powerEngine;
        this.lengthBoat = lengthBoat;
    }
    public void setWaterTransport(int waterVolume, int powerEngine, int lengthBoat){
        this.waterVolume = waterVolume;
        this.powerEngine = powerEngine;
        this.lengthBoat = lengthBoat;
    }
    public void getWaterTransport (){
        System.out.println("Water volume" + this.waterVolume);
        System.out.println("Power of engine" + this.powerEngine);
        System.out.println("Length of boat" + this.lengthBoat);
            }
}
