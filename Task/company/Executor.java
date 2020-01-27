package com.company;

import com.Db.*;


import com.Db.Model.Airtransport;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;


public final class Executor {

   
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory;
        AirtransportMapper airtransportMapper;
        Reader reader = null;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis.config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            airtransportMapper = sqlSessionFactory.openSession().getMapper(AirtransportMapper.class);

            Airtransport airtransport = airtransportMapper.getAirtransportById(2);
            System.out.println(airtransport);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}