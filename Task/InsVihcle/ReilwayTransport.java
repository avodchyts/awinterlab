package com.InsVihcle;

public class ReilwayTransport  extends Vihcle {
    private String typeTrain;
    private int qtyCarriage;
    private int maxSpeed;

    public ReilwayTransport () {}
        public ReilwayTransport (String typeVihcle, int valueVihcle,int yearProduce,String typeTrain, int qtyCarriage, int maxSpeed){
        super(typeVihcle,valueVihcle,yearProduce);
        this.typeTrain = typeTrain;
        this.qtyCarriage = qtyCarriage;
        this.maxSpeed = maxSpeed;
    }
    public void setReilwayTransport(String typeTrain, int qtyCarriage, int maxSpeed){
        this.typeTrain = typeTrain;
        this.qtyCarriage = qtyCarriage;
        this.maxSpeed = maxSpeed;
    }
    public void getReilwayTransport (){
        System.out.println("Type of train-" + this.typeTrain);
        System.out.println("Quantity of carriage- " + this.qtyCarriage);
        System.out.println("Max speed -" + this.maxSpeed);
    }
}
