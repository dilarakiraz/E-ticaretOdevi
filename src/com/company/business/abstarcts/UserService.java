package com.company.business.abstarcts;

import com.company.entities.concretes.User;

public interface UserService {
    void sıgnIn(String email,String password);
    void sıgnUp(User user);
    void userVerify(User user);
}
