package com.shefzee.patterns.behavioural.chainofresponsibility;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String userName, String password) {
        System.out.println("Executed RoleCheckHandler.handle()");
        return handleNext(userName,password);
    }
}
