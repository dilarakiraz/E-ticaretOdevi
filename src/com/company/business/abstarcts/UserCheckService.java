package com.company.business.abstarcts;

import com.company.entities.concretes.User;

public interface UserCheckService  {
     boolean checkFirstName(User user);
     boolean checkLastName(User user);
     boolean checkEmailValidation(User user);
     boolean checkPassword(User user);

}
