package com.Db.POJO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



public class JsonToPojo {
     ObjectMapper mapper;

    public JsonToPojo(){

        mapper = new ObjectMapper();
    }

    public AirtransportPOJO jsonToPojo(String filename) throws IOException {

        try {
            InputStream fileInputStream = new FileInputStream(filename);
            AirtransportPOJO airtransportPOJO = mapper.readValue(fileInputStream, AirtransportPOJO.class);
            fileInputStream.close();
        }catch (IOException aio){aio.printStackTrace();}



 return jsonToPojo(filename);
    }
}