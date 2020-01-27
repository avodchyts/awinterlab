package com.Db;

import com.Db.Model.Landtransport;

import java.util.List;

public interface LandtransportMapper {

    Landtransport getLandtransport(int id);

   List getLandtransports();
}

