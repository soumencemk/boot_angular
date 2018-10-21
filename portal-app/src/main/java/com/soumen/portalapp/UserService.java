package com.soumen.portalapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class UserService {

    private static List<User> userList = Arrays.asList(new User[]{
            new User("1", "Soumen", "soumen.cemk@gmail.com"),
            new User("2", "Prateek", "prateek@gmail.com")});

    public User createUser(User u) {
        return userList.add(u) ? u : null;
    }

    public User deleteUser(User u) {
        return userList.remove(u) ? u : null;
    }

    public List<User> findAll() {
        return userList;
    }

    public User findById(String id) {
        List<User> collect = userList.stream().filter(user -> user.getUserId().equals(id)).collect(Collectors.toList());
        if (collect.size() != 1) {
            return null;
        } else {
            return collect.get(0);
        }

    }
}
