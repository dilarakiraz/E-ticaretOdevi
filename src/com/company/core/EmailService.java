package com.company.core;

import com.company.entities.concretes.User;

public interface EmailService {
    void sendEmail(User user);
}
