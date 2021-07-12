package com.company.core;

import com.company.entities.concretes.User;

public class EmailManager implements EmailService{
    @Override
    public void sendEmail(User user) {
        System.out.println("Doğrulama kodu mailinize gönderilmiştir");
    }
}
