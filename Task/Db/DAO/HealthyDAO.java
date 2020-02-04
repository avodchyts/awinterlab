package com.Db.DAO;

import com.Db.HealthyMapper;
import com.Db.Model.Healthy;
import com.Db.Model.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

public class HealthyDAO extends OpenSession {
protected SqlSessionFactory sqlSessionFactory;
private static final Logger LOGGER = Logger.getLogger(HealthyDAO.class);

public HealthyDAO (SqlSessionFactory sqlSessionFactory){
    this.sqlSessionFactory =sqlSessionFactory;
}
public Healthy getHealthyById(int id) throws Exception{
    try(SqlSession session = sqlSessionFactory.openSession()){
        HealthyMapper mapper = session.getMapper(HealthyMapper.class);
        return mapper.getHealthyById(id);
         }catch (Exception eh){
      eh.printStackTrace();
      LOGGER.error(eh);
    }
  return getHealthyById(id);
}
}
