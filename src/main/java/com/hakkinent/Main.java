package com.hakkinent;

import com.hakkinent.model.entities.Department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dao-jpa");
        EntityManager em = emf.createEntityManager();

        Department dep = new Department("Música");

        em.getTransaction().begin();
        em.persist(dep);
        em.getTransaction().commit();

        System.out.println("Pronto!");
    }
}