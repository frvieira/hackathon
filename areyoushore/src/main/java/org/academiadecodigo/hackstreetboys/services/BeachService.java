package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.persistence.dao.BeachDao;
import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeachService {

    private BeachDao beachDao;

    @Autowired
    public void setBeachDao(BeachDao beachDao) {
        this.beachDao = beachDao;
    }

    public List<Beach> list() {
        return beachDao.list();
    }
}
