package com.Db.POJO;
import com.Db.Model.Airtransport;
import com.InsVehicle.Transport;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;
public class JacksonPojoToJson {

    private static final Logger LOGGER = Logger.getLogger(JacksonPojoToJson.class);
    private ObjectMapper mapper;

    public JacksonPojoToJson() {

        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public String writeJson(Airtransport airtransport) throws IOException {
     try {
         String objectJson = mapper.writeValueAsString(airtransport);
         return objectJson;
     }catch(IOException ew){ew.printStackTrace();LOGGER.error(ew);}
    return writeJson(airtransport);
    }


    public void toJsonFile(Airtransport airtransport, String filename) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename + ".json");
            mapper.writeValue(fileOutputStream, airtransport);
            fileOutputStream.close();
        } catch (IOException e) {LOGGER.debug(e); e.printStackTrace();
        throw new NullPointerException();
        }
    }
}


