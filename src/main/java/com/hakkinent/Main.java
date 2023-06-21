package com.hakkinent;

import com.hakkinent.db.EntityManagerConnection;
import com.hakkinent.model.entities.Department;
import com.hakkinent.model.entities.Seller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("dao-jpa");
        EntityManager em = EntityManagerConnection.createEntityManager();

        Department dep = em.find(Department.class, 1);

        System.out.println(dep);

        EntityManagerConnection.closeManagers();
    }
}