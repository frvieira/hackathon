package org.academiadecodigo.hackstreetboys.persistence.dao;


import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.springframework.stereotype.Repository;


@Repository
public class JpaBeachDao extends GenericDao<Beach> implements Dao<Beach> {

    public JpaBeachDao() {
        super(Beach.class);
    }
}
