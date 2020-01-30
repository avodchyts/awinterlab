package com.Db.POJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JacksonPojoToJson {
public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        AirtransportPOJO apojo = new AirtransportPOJO();
        apojo.setName("AirBus");
        apojo.setLengthWing(50);
        apojo.setTypeEngine("turboreactive");
        apojo.setQuantityEngine(4);
        apojo.setSizeVolume(200);
        apojo.setIdAirtransport(3);
        apojo.setIdTransport(1);

    String AirJson = mapper.writeValueAsString(apojo);
    System.out.println(AirJson);

    FileOutputStream fileOutputStream = new FileOutputStream("Air.json");
    mapper.writeValue(fileOutputStream, apojo);
    fileOutputStream.close();

    }
}

