package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users=new ArrayList<User>();
    @Override
    public void add(User user) {
        users.add(user);

    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public boolean emailCheck(String email) {
        for(User i:users){
            if(i.getEmail()==email){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean passwordCheck(String password) {
        for(User i:users){
            if(i.getPassword()==password){
                return true;
            }
        }
        return false;

    }
}
