package org.academiadecodigo.hackstreetboys.services.mock;

import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.academiadecodigo.hackstreetboys.services.BeachService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class MockBeachService extends AbstractMockService<Beach> implements BeachService {

    @Override
    public List<Beach> list() {
        return new ArrayList<>(modelMap.values());
    }

    @Override
    public Beach get(Integer id) {
        return modelMap.get(id);
    }

    @Override
    public Beach save(Beach beach) {

        if(beach.getId() == null) {
            beach.setId(getNextId());
        }
        modelMap.put(beach.getId(), beach);
        return beach;
    }

    @Override
    public void delete(Integer id) {

        modelMap.remove(id);
    }
}
