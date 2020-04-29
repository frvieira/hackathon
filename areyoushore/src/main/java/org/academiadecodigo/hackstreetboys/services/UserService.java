package org.academiadecodigo.hackstreetboys.services;

import org.academiadecodigo.hackstreetboys.persistence.model.User;

import java.util.List;

public interface UserService {

    List<User> list();

    User getById(Integer id);

    User getByUserName(String userName);

    User save(User user);

    void delete(Integer id);
}
