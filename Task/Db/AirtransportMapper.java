package com.Db;

import com.Db.Model.Airtransport;

import java.util.List;

public interface AirtransportMapper {

    Airtransport getAirtransportById(int id );

    List<Airtransport> getAirtransport();

   Airtransport insertAirtransport(Airtransport entity);

  }

