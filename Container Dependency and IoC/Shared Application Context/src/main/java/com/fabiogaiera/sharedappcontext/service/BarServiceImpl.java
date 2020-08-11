package com.fabiogaiera.sharedappcontext.service;

import org.springframework.beans.factory.annotation.Autowired;

public class BarServiceImpl implements BarService {

    private final FooService fooService;

    @Autowired
    public BarServiceImpl(FooServiceImpl fooService) {
        this.fooService = fooService;
    }

    @Override
    public String serviceFromBar() {
        return fooService.serviceFromFoo();
    }

}