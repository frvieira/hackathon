package org.academiadecodigo.hackstreetboys.services.mock;

import org.academiadecodigo.hackstreetboys.persistence.model.User;
import org.academiadecodigo.hackstreetboys.services.UserService;

import java.util.List;

public class MockUserService extends AbstractMockService<User> implements UserService {

    @Override
    public List<User> list() {
        return modelList;
    }

    @Override
    public User getById(Integer id) {
        return modelList.get(id);
    }

    @Override
    public User getByUserName(String userName) {
        for(User user : modelList) {
            if(user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User save(User user) {
        modelList.add(user);
        return user;
    }

    @Override
    public void delete(Integer id) {
        modelList.remove(id);
    }
}
