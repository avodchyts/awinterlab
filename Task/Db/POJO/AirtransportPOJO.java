package com.Db.POJO;

import java.sql.Connection;
import java.util.List;

public class AirtransportPOJO {

        private String name;
        private int lengthWing;
        private String typeEngine;
        private int quantityEngine;
        private int sizeVolume;
        private int idAirtransport;
        private int idTransport;

        public AirtransportPOJO() {}

        public AirtransportPOJO(String name,int lengthWing, String typeEngine,int quantityEngine,int sizeVolue,int idAirtransport, int idTransport){
            this.name=name;
            this.lengthWing= lengthWing;
            this.typeEngine = typeEngine;
            this.quantityEngine= quantityEngine;
            this.sizeVolume= sizeVolue;
            this.idAirtransport= idAirtransport;
            this.idTransport=idTransport;
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


