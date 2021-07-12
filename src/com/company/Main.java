package com.company;

import com.company.business.abstarcts.UserService;
import com.company.business.concretes.UserCheckManager;
import com.company.business.concretes.UserManager;
import com.company.core.EmailManager;
import com.company.core.GoogleRegisterManagerAdapter;
import com.company.core.GoogleRegisterService;
import com.company.core.RegexManager;
import com.company.dataAccess.concretes.HibernateUserDao;
import com.company.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
	User user1 =new User(1,"Dilara","Kiraz","dilarakiraz@gmail.com","dilara00");
	User user2 =new User(2,"Yavuz","Kiraz","yavuzkiraz@gmail.com","yavuz09");

	UserService userService = new UserManager(new HibernateUserDao(),new UserCheckManager(new RegexManager()), new EmailManager());
	userService.sıgnUp(user1);
	userService.userVerify(user1);

	userService.sıgnUp(user2);
	userService.userVerify(user2);


    userService.sıgnIn("dilarakiraz@gmail.com","dilara00");

		GoogleRegisterService googleRegisterService=new GoogleRegisterManagerAdapter();
		googleRegisterService.signUpWithGoogle("--------HOŞ GELDİNİZ-------");

    }
}
