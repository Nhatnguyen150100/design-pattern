package org.example;

import org.example.dao.impl.UserDao;
import org.example.entity.User;

public class Main {
    public static void main(String[] args) {
        var userDao = new UserDao();

        User user1 = userDao.get(1).orElseThrow(() -> new RuntimeException("Exception"));
        System.out.println("user1: " + user1);

        user1.setName("updated." + user1.getName());
        userDao.update(user1);

        System.out.println("All users: ");
        userDao.getAll().forEach(System.out::println);
    }
}