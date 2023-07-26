package com.hakkinent.model.dao.impl;

import com.hakkinent.db.DbException;
import com.hakkinent.model.dao.SellerDao;
import com.hakkinent.model.entities.Department;
import com.hakkinent.model.entities.Seller;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class SellerDaoJPA implements SellerDao {
    private EntityManager em;

    public SellerDaoJPA(EntityManager em) {
        this.em = em;
    }

    @Override
    public void insert(Seller obj) {
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void update(Seller obj) {
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void deleteById(Integer id) {
        try {
            em.getTransaction().begin();
            Seller seller = findById(id);
            em.remove(seller);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public Seller findById(Integer id) {
        try{
            Seller seller = em.find(Seller.class, id);
            return seller;
        }catch (Exception e){
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public List<Seller> findAll() {
        try{
            TypedQuery<Seller> query = em.createQuery("SELECT seller FROM Seller seller "+
                            "INNER JOIN seller.department ORDER BY seller.name",
                    Seller.class);

            List<Seller> sellers = query.getResultList();

            return sellers;
        }catch (Exception e){
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        try{
            TypedQuery<Seller> query = em.createQuery("SELECT seller FROM Seller seller "+
                            "WHERE seller.department.id = " + department.getId(),
                    Seller.class);

            List<Seller> sellers = query.getResultList();

            return sellers;
        }catch (Exception e){
            throw new DbException(e.getMessage());
        }
    }
}
