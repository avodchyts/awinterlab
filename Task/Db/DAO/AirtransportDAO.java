package com.Db.DAO;

import com.Db.AirtransportMapper;
import com.Db.Model.Airtransport;
import com.Db.Model.OpenSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;


public class AirtransportDAO extends OpenSession implements AirtransportMapper {
    private static final Logger LOGGER = Logger.getLogger(AirtransportDAO.class);
    protected SqlSessionFactory sqlSessionFactory;
    private Airtransport airtransport;

    public AirtransportDAO(){}

    public AirtransportDAO ( SqlSessionFactory sqlSessionFactory){
         this.sqlSessionFactory=sqlSessionFactory;
    }

    @Override
    public Airtransport getAirtransportById(int id) throws ExceptionInInitializerError {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AirtransportMapper mapper = session.getMapper(AirtransportMapper.class);
            return mapper.getAirtransportById(id);


        }catch (ExceptionInInitializerError ex){
            ex.printStackTrace(); LOGGER.error(ex);
        }
       return getAirtransportById(id);
    }

    @Override
    public void insertAirtransport(Airtransport airtransport) throws Exception {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AirtransportMapper mapper2 = session.getMapper(AirtransportMapper.class);
            mapper2.insertAirtransport(airtransport);
            session.commit();
            session.close();
        }catch (Exception e){e.printStackTrace();}


    }

    @Override
    public List<Airtransport> getAirtransport() throws ExceptionInInitializerError {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            AirtransportMapper mapper = session.getMapper(AirtransportMapper.class);
            List <Airtransport> airtransports = (List<Airtransport>) mapper.getAirtransport();
            return airtransports;
        }catch (ExceptionInInitializerError el){ el.printStackTrace(); LOGGER.error(el);

        }
        return getAirtransport();
    }
}
