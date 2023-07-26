package com.hakkinent;

import com.hakkinent.db.EntityManagerConnection;
import com.hakkinent.model.dao.DaoFactory;
import com.hakkinent.model.dao.SellerDao;
import com.hakkinent.model.entities.Department;
import com.hakkinent.model.entities.Seller;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("dao-jpa");
        Scanner sc = new Scanner(System.in);

        EntityManager em = EntityManagerConnection.createEntityManager();

        Department dep = em.find(Department.class, 1);


        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(6);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findByAll =====");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update =====");
        seller = sellerDao.findById(7);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        EntityManagerConnection.closeManagers();
    }
}