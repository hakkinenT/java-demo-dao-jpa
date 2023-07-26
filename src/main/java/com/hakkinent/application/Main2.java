package com.hakkinent.application;

import com.hakkinent.db.EntityManagerConnection;
import com.hakkinent.model.dao.DaoFactory;
import com.hakkinent.model.dao.DepartmentDao;
import com.hakkinent.model.entities.Department;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManager em = EntityManagerConnection.createEntityManager();

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert =====");
        Department newDepartment = new Department(null, "Food");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update =====");
        Department department2 = departmentDao.findById(1);
        department2.setName("Music");
        departmentDao.update(department2);
        System.out.println("Update completed");

        sc.close();
        EntityManagerConnection.closeManagers();
    }
}
