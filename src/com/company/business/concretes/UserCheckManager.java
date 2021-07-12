package com.company.business.concretes;

import com.company.business.abstarcts.UserCheckService;
import com.company.core.RegexService;
import com.company.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
    public RegexService regexService;

    public UserCheckManager(RegexService regexService){
        super();
        this.regexService=regexService;
    }
    @Override
    public boolean checkFirstName(User user) {
        if(user.getFirstName().isEmpty()){
            System.out.println("Boş alan bırakılamaz.Lütfen alanları doldurun");
            return false;
        }else{
            if(user.getFirstName().length()<=2){
                System.out.println("Girilen 3 karakteden kısa olamaz");
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean checkLastName(User user) {
        if(user.getLastName().isEmpty()){
            System.out.println("Boş alan bırakılamaz.Lütfen alanları doldurun");
            return false;
        }else{
            if(user.getLastName().length()<=2){
                System.out.println("Girilen 3 karakteden kısa olamaz");
                return false;
            }
        }
        return true;

    }

    @Override
    public boolean checkEmailValidation(User user) {
        if(this.regexService.checkEmailFormat(user.getEmail())){
            System.out.println("Başarılı");
            return true;

        }else{
            System.out.println("Girilen email uygun değil");
            return false;
        }

    }

    @Override
    public boolean checkPassword(User user) {
        if(user.getPassword().isEmpty()){
            System.out.println("Boş alan bırakılamaz.Lütfen alanları doldurun");
            return false;
        }else{
            if(user.getPassword().length()<6){
                System.out.println("şifre 6 karakterden kısa olamaz.");
                return false;
            }
        }
        return true;

    }
}
