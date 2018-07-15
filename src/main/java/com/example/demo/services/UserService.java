package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User save(User user);

    public List<User> findAllUser();

    public User findOne(int id);

    public void delete(int id);




}
