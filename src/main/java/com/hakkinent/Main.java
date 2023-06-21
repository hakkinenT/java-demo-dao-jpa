package com.hakkinent;

import com.hakkinent.model.entities.Department;
import com.hakkinent.model.entities.Seller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dao-jpa");
        EntityManager em = emf.createEntityManager();

        Department dep = em.find(Department.class, 1);
        Seller seller = new Seller("João Marcelo", "joaomarcelo@gmail.com", new Date(), 4000.0, dep);

        em.getTransaction().begin();
        em.persist(seller);
        em.getTransaction().commit();

        System.out.println("Pronto!");

        emf.close();
        em.close();
    }
}