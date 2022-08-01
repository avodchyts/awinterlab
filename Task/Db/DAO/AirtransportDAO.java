package com.Db.DAO;

import com.Db.AirtransportMapper;
import com.Db.Model.Airtransport;
import com.Db.Model.OpenSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


public class AirtransportDAO extends OpenSession implements AirtransportMapper {

    protected SqlSessionFactory ssf;
    private AirtransportMapper entity;

    public AirtransportDAO(){}

    public AirtransportDAO ( SqlSessionFactory ssf){
         this.ssf=ssf;
    }

    @Override
    public Airtransport getAirtransportById(int id) {
        try (SqlSession session = ssf.openSession()) {
            AirtransportMapper mapper = session.getMapper(AirtransportMapper.class);
            return mapper.getAirtransportById(id);
        }

    }

    @Override
    public Airtransport insertAirtransport(Airtransport entity) {
        try (SqlSession session = ssf.openSession()) {
            AirtransportMapper mapper2 = session.getMapper(AirtransportMapper.class);
            mapper2.insertAirtransport(entity);
        }

        return entity;
    }

    @Override
    public List<Airtransport> getAirtransport() {
        try (SqlSession session = ssf.openSession()) {
            AirtransportMapper mapper = session.getMapper(AirtransportMapper.class);
            List <Airtransport> airtransports = (List<Airtransport>) mapper.getAirtransport();
            return airtransports;
        }
    }
}
