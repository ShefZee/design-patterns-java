package com.shefzee.patterns.behavioural.chainofresponsibility;

public class UserExistsHandler extends Handler {

    @Override
    public boolean handle(String userName, String password) {
        System.out.println("Executed UserExistsHandler.handle()");
        return handleNext(userName,password);
    }
}
