package com.company.core;
import com.company.GoogleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService{

    @Override
    public void signUpWithGoogle(String message) {
        GoogleRegisterManager googleRegisterManager=new GoogleRegisterManager();
        googleRegisterManager.add(message);
    }

}
