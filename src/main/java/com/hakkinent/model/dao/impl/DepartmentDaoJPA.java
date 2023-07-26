package com.hakkinent.model.dao.impl;

import com.hakkinent.db.DbException;
import com.hakkinent.model.dao.DepartmentDao;
import com.hakkinent.model.entities.Department;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class DepartmentDaoJPA implements DepartmentDao {
    private EntityManager em;

    public DepartmentDaoJPA(EntityManager em){
        this.em = em;
    }
    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        try {
            Department department = em.find(Department.class, id);
            return department;
        }catch (Exception e){
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public List<Department> findAll() {
        try{
            TypedQuery<Department> query = em.createQuery("SELECT dep FROM Department dep", Department.class);
            List<Department> departments = query.getResultList();
            return departments;
        }catch (Exception e){
            throw new DbException(e.getMessage());
        }
    }
}
