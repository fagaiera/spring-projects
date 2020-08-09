package com.fabiogaiera.dynamicbean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("Service1")
public class SomeServiceImpl1 implements SomeService {

    private static final Logger logger = LoggerFactory.getLogger(SomeServiceImpl1.class);

    @Override
    public void execute() {
        logger.info("Executing service implementation 1");
    }

}