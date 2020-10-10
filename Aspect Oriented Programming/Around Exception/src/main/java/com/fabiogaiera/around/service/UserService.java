package com.fabiogaiera.around.service;

public class UserService {

    public void someUserService() {
        try {
            throw new Exception("Exception");
        } catch (Exception ex) {
            System.out.println("Exception caught");
        }
    }

}