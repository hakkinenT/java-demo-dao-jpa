package com.hakkinent.model.dao;

import com.hakkinent.model.dao.impl.SellerDaoJPA;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJPA();
    }
}
