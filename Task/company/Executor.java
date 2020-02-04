package com.company;

import com.Db.POJO.AirtransportPOJO;
import com.Db.POJO.JacksonPojoToJson;
import com.Db.POJO.JsonToPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;

import com.Db.DAO.HealthyDAO;
import com.Db.Model.Airtransport;
import com.Db.DAO.AirtransportDAO;
import com.Db.Model.Healthy;
import com.Db.Model.OpenSession;

import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;


public final class Executor {


    public static void main(String[] args) throws Exception {

    SqlSessionFactory sqlSessionFactory = new OpenSession().getOpenSession();
    Airtransport airtransport = new AirtransportDAO(sqlSessionFactory).getAirtransportById(2);

    List<Airtransport> airtransports =new AirtransportDAO(sqlSessionFactory).getAirtransport();
    for(Airtransport jets:airtransports);

    JsonToPojo jsonToPojo = new JsonToPojo();
    AirtransportPOJO airtransportPOJO =jsonToPojo.JsonToPojo("boeing.json");

    Airtransport boeing2= new Airtransport();
    boeing2.setTypeEngine(airtransportPOJO.getTypeEngine());
    boeing2.setName(airtransportPOJO.getName());
    boeing2.setSizeVolume(airtransportPOJO.getSizeVolume());
    boeing2.setQuantityEngine(airtransportPOJO.getQuantityEngine());
    boeing2.setLengthWing(airtransportPOJO.getLengthWing());
    boeing2.setIdAirtransport(airtransportPOJO.getIdAirtransport());
    boeing2.setIdTransport(airtransportPOJO.getIdTransport());

    AirtransportDAO boeingnew =new AirtransportDAO(sqlSessionFactory);
    boeingnew.insertAirtransport(boeing2);

     List<Airtransport> airtransports1 =new AirtransportDAO(sqlSessionFactory).getAirtransport();
     for(Airtransport jets:airtransports1) {
              JacksonPojoToJson pojoToJson = new JacksonPojoToJson();
       pojoToJson.writeJson(jets);
       pojoToJson.toJsonFile(jets, "airtransports");
   }

   Iterator<Airtransport> airtransportIterator = airtransports.iterator();
   while(airtransportIterator.hasNext()){airtransportIterator.next();

       JacksonPojoToJson pojoToJson = new JacksonPojoToJson();
       pojoToJson.writeJson((Airtransport) airtransports);
       pojoToJson.toJsonFile((Airtransport) airtransports, "airtransports1");
   }
    }
}