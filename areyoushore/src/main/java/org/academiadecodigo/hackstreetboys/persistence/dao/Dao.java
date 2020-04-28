package org.academiadecodigo.hackstreetboys.persistence.dao;

import java.util.List;

public interface Dao<T> {

    List<T> list();

    T findById(Integer id);

    T findByName(String name);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);
}
