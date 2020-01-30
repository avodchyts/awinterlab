package com.Db.Model;

import com.InsVehicle.Transport;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class OpenSession  {
    private static final Logger LOGGER = Logger.getLogger(OpenSession.class);
    public OpenSession (){};
    public static SqlSessionFactory getOpenSession() {
        SqlSessionFactory sqlSessionFactory = null;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch ( IOException e){
            LOGGER.error(e);
            e.printStackTrace();
            throw new IllegalArgumentException("Failed to create SqlSessionFactory from " + "mybatis.config.xml" );
        }

        return sqlSessionFactory;
    }

}
