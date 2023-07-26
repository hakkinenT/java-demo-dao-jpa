package com.hakkinent.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerConnection {
    private static EntityManager entityManager = null;
    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager(){
        emf = Persistence.createEntityManagerFactory("dao-jpa");
        if(entityManager == null){
            entityManager = emf.createEntityManager();
        }

        return entityManager;
    }

    public static void closeManagers(){
        entityManager.close();
        emf.close();

    }

}
