package com.hakkinent.application;

import com.hakkinent.db.EntityManagerConnection;
import com.hakkinent.model.dao.DaoFactory;
import com.hakkinent.model.dao.DepartmentDao;
import com.hakkinent.model.entities.Department;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManager em = EntityManagerConnection.createEntityManager();

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        sc.close();
        EntityManagerConnection.closeManagers();
    }
}
