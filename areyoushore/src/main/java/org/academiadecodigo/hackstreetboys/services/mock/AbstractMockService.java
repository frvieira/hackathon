package org.academiadecodigo.hackstreetboys.services.mock;

import org.academiadecodigo.hackstreetboys.persistence.model.Model;

import java.util.*;

public class AbstractMockService<T extends Model> {

    //protected Map<Integer, T> modelMap = new HashMap<>();

    protected List<T> modelList = new LinkedList<>();

    /*
    protected Integer getNextId() {
        return modelMap.isEmpty() ? 1 : Collections.max(modelMap.keySet()) + 1;
    }

     */
}
