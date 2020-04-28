package org.academiadecodigo.hackstreetboys.services.mock;

import org.academiadecodigo.hackstreetboys.persistence.model.Model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AbstractMockService<T extends Model> {

    protected Map<Integer, T> modelMap = new HashMap<>();

    protected Integer getNextId() {
        return modelMap.isEmpty() ? 1 : Collections.max(modelMap.keySet()) + 1;
    }
}
