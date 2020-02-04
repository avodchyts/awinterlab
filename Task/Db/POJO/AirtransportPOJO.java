package com.Db.POJO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class AirtransportPOJO {

        private String name;
        private int lengthWing;
        private String typeEngine;
        private int quantityEngine;
        private int sizeVolume;
        private int idAirtransport;
        private int idTransport;
        private List<AirtransportPOJO> airtransportPOJOs = new ArrayList<AirtransportPOJO>();
        public AirtransportPOJO() {}

        public AirtransportPOJO(String name,int sizeVolue,int idAirtransport){
            this.name=name;
            this.sizeVolume= sizeVolue;
            this.idAirtransport= idAirtransport;
        }

    public void setAirtransportPOJOs(List<AirtransportPOJO> airtransportPOJOs) {
        this.airtransportPOJOs = airtransportPOJOs;
    }

    public List<AirtransportPOJO> getAirtransportPOJOs() {
        return airtransportPOJOs;
    }

    public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }



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



        public String toString (){return "Airtransport {" +"IdAirTransport ="+" "+ idAirtransport+" "+"Name="+name+" "+"LengthWing="+lengthWing+" "+"TypeEngine="+typeEngine+" "+"QuantityEngine="+quantityEngine+" "+"SizeVolume="+sizeVolume+" "+"IdTransport ="+idTransport+" "+"}"; }


    }


