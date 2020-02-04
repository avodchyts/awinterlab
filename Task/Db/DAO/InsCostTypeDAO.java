package com.Db.DAO;

import com.Db.InsCostTypeMapper;
import com.Db.Model.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

public class InsCostTypeDAO extends OpenSession {
    private static final Logger LOGGER = Logger.getLogger(InsCostTypeDAO.class);
    SqlSessionFactory sqlSessionFactory;

public InsCostTypeDAO (SqlSessionFactory sqlSessionFactory){
    this.sqlSessionFactory=sqlSessionFactory;
}

public InsCostTypeMapper getInsCostTypeById(int Id) {
    try (SqlSession session = sqlSessionFactory.openSession()) {
        InsCostTypeMapper mapper = session.getMapper(InsCostTypeMapper.class);
        return mapper.getInsCostTypeById(Id);
    } catch (Exception e) {
        e.printStackTrace();
        LOGGER.error(e);

     }
 return  getInsCostTypeById(Id);
  }
}
