package com.company.dataAccess.abstracts;

import com.company.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> getAll();
    boolean emailCheck(String email);
    boolean passwordCheck(String password);

}
