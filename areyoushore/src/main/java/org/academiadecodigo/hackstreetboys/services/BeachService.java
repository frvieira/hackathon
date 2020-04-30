package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.model.Beach;

import java.util.List;

public interface BeachService {

    List<Beach> list();

    Beach get(Integer id);

    Beach save(Beach beach);

    void delete(Integer id);

    void deleteAll();

}
