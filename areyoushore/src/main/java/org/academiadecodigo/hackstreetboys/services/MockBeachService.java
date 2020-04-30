package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.model.Beach;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockBeachService extends AbstractMockService<Beach> implements BeachService{

    @Override
    public List<Beach> list() {
        return modelList;
    }

    @Override
    public Beach get(Integer id) {
        return modelList.get(id);
    }

    @Override
    public Beach save(Beach beach) {
        modelList.add(beach);
        return beach;
    }

    @Override
    public void delete(Integer id) {
        modelList.remove(id);
    }

    @Override
    public void deleteAll() {
        modelList.clear();
    }
}
