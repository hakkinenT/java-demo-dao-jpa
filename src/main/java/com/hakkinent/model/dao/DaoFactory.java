package com.hakkinent.model.dao;

import com.hakkinent.db.EntityManagerConnection;
import com.hakkinent.model.dao.impl.DepartmentDaoJPA;
import com.hakkinent.model.dao.impl.SellerDaoJPA;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJPA(EntityManagerConnection.createEntityManager());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJPA(EntityManagerConnection.createEntityManager());
    }
}
