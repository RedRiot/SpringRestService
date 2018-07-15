package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        return (List<User>) userRepository.findAll();

    }

    @Override
    public User findOne(int id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);

    }

    /*public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        Date date = new Date();
        if (user.getId()==0) {
            user.setId((++userCount));
            user.setDate(date);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }*/
}
