package com.Db.DAO;

import com.Db.HealthyMapper;
import com.Db.Model.Healthy;
import com.Db.Model.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class HealthyDAO extends OpenSession {
protected SqlSessionFactory ssf;

public HealthyDAO (SqlSessionFactory ssf){
    this.ssf =ssf;
}
public Healthy getHealthyById(int Id){
    try(SqlSession session = ssf.openSession()){
        HealthyMapper mapper = session.getMapper(HealthyMapper.class);
        return mapper.getHealthyById(Id);

    }
}
}
