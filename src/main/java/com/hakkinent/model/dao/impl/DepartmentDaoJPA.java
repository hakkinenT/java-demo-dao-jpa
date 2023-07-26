package com.hakkinent.model.dao.impl;

import com.hakkinent.model.dao.DepartmentDao;
import com.hakkinent.model.entities.Department;

import javax.persistence.EntityManager;
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
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
