package com.company.business.concretes;

import com.company.business.abstarcts.UserCheckService;
import com.company.business.abstarcts.UserService;
import com.company.core.EmailService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

public class UserManager implements UserService {
    public boolean control=false;
    UserDao userDao;
    UserCheckService userCheckService;
    EmailService emailService;
    public UserManager(UserDao userDao,UserCheckService userCheckService,EmailService emailService){
        super();
        this.userDao=userDao;
        this.userCheckService=userCheckService;
        this.emailService=emailService;
    }
    @Override
    public void sıgnIn(String email,String password) {

        if(userDao.emailCheck(email)==false && userDao.passwordCheck(password)==false){
            System.out.println("Bilgileriniz yanlış.Tekrar deneyiniz.");

        }else if(userDao.emailCheck(email)==false){
            System.out.println("Email adresinizi yanlış girdiniz");
        }else if(userDao.passwordCheck(password)==false){
            System.out.println("Şifrenizi hatalı girdiniz");
        }else{
            System.out.println("Sisteme yönlendiriliyorsunuz.");
        }

    }


    @Override
    public void sıgnUp(User user) {
        if(userCheckService.checkFirstName(user) == true && userCheckService.checkLastName(user)==true && userCheckService.checkEmailValidation(user)==true && userCheckService.checkPassword(user) == true){
            if(userDao.emailCheck(user.getEmail())==false){
                emailService.sendEmail(user);
                control=true;
            }else {
                System.out.println("Böyle bir email daha önceden kayıt edilmiş");
                control = false;
            }
            }else {
                control=false;
            }
        }



    @Override
    public void userVerify(User user) {
        if(control==true){
            userDao.add(user);
            System.out.println(" " +user.getFirstName() +"  " +user.getLastName()  +" Sisteme kayıt oldu");
            control=false;
        }else{
            System.out.println("Kullanıcı bulunamadı");
            control=false;
        }

    }
}
