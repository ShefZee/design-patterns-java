package com.shefzee.patterns.behavioural.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        Handler userExistsHandler = new UserExistsHandler();
        Handler validPasswordHandler = new ValidPasswordHandler();
        Handler roleCheckHandler = new RoleCheckHandler();
        userExistsHandler.setNextHandler(validPasswordHandler);
        validPasswordHandler.setNextHandler(roleCheckHandler);

        AuthService service = new AuthService(userExistsHandler);
        service.logIn("shef", "pwd");
    }
}
