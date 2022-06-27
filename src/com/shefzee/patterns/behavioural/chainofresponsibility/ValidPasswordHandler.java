package com.shefzee.patterns.behavioural.chainofresponsibility;

public class ValidPasswordHandler extends Handler {

    @Override
    public boolean handle(String userName, String password) {
        System.out.println("Executed ValidPasswordHandler.execute()");
        return handleNext(userName,password);
    }
}
