package org.academiadecodigo.hackstreetboys.persistence.dao;

import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.academiadecodigo.hackstreetboys.persistence.model.CapacityEvaluator;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;

@Repository
public class BeachDao extends Beach implements Dao<Beach> {

    protected Beach beach;
    private List<Beach> list = new LinkedList<>();


    @PersistenceContext
    protected EntityManager em;

    public BeachDao (Beach beach) {
        this.beach = beach;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Beach> list() {
        return list;
    }

    @Override
    public Beach findById(Integer id) {
        return list.get(id);
    }

    @Override
    public Beach findByName(String name) {
        for(Beach beach : list) {
            if (beach.getBeachName().equals(name)) {
                return beach;
            }
        }
        return null;
    }

    @Override
    public boolean save(Beach beach) {
        return list.add(beach);
    }

    @Override
    public Beach update(Integer id) {
        return null;
    }

    @Override
    public CapacityEvaluator updateCapacityEvaluator(Integer id, CapacityEvaluator capacityEvaluator) {
        for(Beach bch : list) {
            if(bch.getId() == id) {
                bch.setCapacityEvaluator(capacityEvaluator);
                return bch.getCapacityEvaluator();
            }
        }
        return null;
    }


    @Override
    public void delete(Integer id) {
        if(list.get(id) != null) {
            list.remove(id);
        }
    }
}
