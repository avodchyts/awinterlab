package com.company;

import com.Db.POJO.AirtransportPOJO;
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


public final class Executor {


    public static void main(String[] args) throws IOException {

     ObjectMapper mapper = new ObjectMapper();
       mapper.enable(SerializationFeature.INDENT_OUTPUT);
    SqlSessionFactory ssf = new OpenSession().getOpenSession();
     Airtransport boeing = new AirtransportDAO(ssf).getAirtransportById(2);

     FileOutputStream fileOutputStream = new FileOutputStream("boeing.json");
     mapper.writeValue(fileOutputStream, boeing);
     fileOutputStream.close();
     System.out.println(boeing);


        ObjectMapper mapper1 = new ObjectMapper();
        AirtransportPOJO airbus = new AirtransportPOJO();
        airbus.setName("AirBus");
        airbus.setLengthWing(50);
        airbus.setTypeEngine("turboreactive");
        airbus.setQuantityEngine(4);
        airbus.setSizeVolume(200);
        airbus.setIdAirtransport(3);
        airbus.setIdTransport(1);

       String AirBusJson = mapper1.writeValueAsString(airbus);
        System.out.println(AirBusJson);

        FileOutputStream fileOutputStream2 = new FileOutputStream("AirBus.json");
        mapper1.writeValue(fileOutputStream2, airbus);
        fileOutputStream2.close();

        System.out.println("======================");

        ObjectMapper mapper3 = new ObjectMapper();
        mapper3.enable(SerializationFeature.INDENT_OUTPUT);

        InputStream fileInputStream3 = new FileInputStream("AirBus.json");
        Airtransport airtransport =mapper3.readValue(fileInputStream3,Airtransport.class);
        fileInputStream3.close();
        System.out.println(airtransport);
     SqlSessionFactory ssf2 = new OpenSession().getOpenSession();
         Airtransport bus = new AirtransportDAO(ssf2).insertAirtransport(airtransport);
        System.out.println(bus);
       System.out.println("====================");
        SqlSessionFactory ssf4 = new OpenSession().getOpenSession();
        Airtransport air= new AirtransportDAO(ssf4).getAirtransportById(3);
        System.out.println(air);



    }
}