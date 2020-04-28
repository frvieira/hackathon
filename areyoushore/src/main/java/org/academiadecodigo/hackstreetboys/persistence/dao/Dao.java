package org.academiadecodigo.hackstreetboys.persistence.dao;

import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.academiadecodigo.hackstreetboys.persistence.model.CapacityEvaluator;

import java.util.List;

public interface Dao<T> {

    List<T> list();

    T findById(Integer id);

    T findByName(String name);

    boolean save(T t);

    T update(Integer id);

    CapacityEvaluator updateCapacityEvaluator(Integer id, CapacityEvaluator capacityEvaluator);

    void delete(Integer id);
}
