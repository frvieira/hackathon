package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.persistence.dao.JpaBeachDao;
import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeachService {

    private JpaBeachDao jpaBeachDao;

    @Autowired
    public void setJpaBeachDao(JpaBeachDao jpaBeachDao) {
        this.jpaBeachDao = jpaBeachDao;
    }

    public List<Beach> list() {
        return jpaBeachDao.list();
    }
}
