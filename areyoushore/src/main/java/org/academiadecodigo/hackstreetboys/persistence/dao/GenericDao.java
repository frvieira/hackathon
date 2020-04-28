package org.academiadecodigo.hackstreetboys.persistence.dao;

import org.academiadecodigo.hackstreetboys.persistence.model.Model;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class GenericDao<T extends Model> implements Dao<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericDao(Class<T> modelType) {
        this.modelType = modelType;
    }


    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<T> list() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    @Override
    public T findByName(String name) {
        return em.find(modelType, name);
    }

    @Override
    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }

    @Override
    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }
}
