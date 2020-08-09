package com.fabiogaiera.afterthrowing.service;

public class UserService {

    public void someUserService() throws Exception {
        System.out.println("Starting service");
        throw new Exception("An exception thrown");
    }

}
