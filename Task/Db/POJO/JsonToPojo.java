package com.Db.POJO;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JsonToPojo {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {


        ObjectMapper mapper = new ObjectMapper();

        InputStream fileInputStream = new FileInputStream("airtransport.json");

        AirtransportPOJO airtransport =mapper.readValue(fileInputStream,AirtransportPOJO.class);
        fileInputStream.close();

    }
}