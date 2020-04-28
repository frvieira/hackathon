package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.persistence.dao.BeachDao;
import org.academiadecodigo.hackstreetboys.persistence.dao.JpaBeachDao;
import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class BeachServiceImpl implements BeachService {

    private BeachDao beachDao;


    public void setBeachDao(BeachDao beachDao) {
        this.beachDao = beachDao;
    }

    @Override
    public List<Beach> list() {
        return beachDao.list();
    }
}
