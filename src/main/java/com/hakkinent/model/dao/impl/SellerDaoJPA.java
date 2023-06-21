package com.hakkinent.model.dao.impl;

import com.hakkinent.model.dao.SellerDao;
import com.hakkinent.model.entities.Department;
import com.hakkinent.model.entities.Seller;

import java.util.List;

public class SellerDaoJPA implements SellerDao {
    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        return null;
    }
}
