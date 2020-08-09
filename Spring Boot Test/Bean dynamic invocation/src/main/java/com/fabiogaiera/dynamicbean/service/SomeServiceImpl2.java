package com.fabiogaiera.dynamicbean.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("Service2")
public class SomeServiceImpl2 implements SomeService {

    private static final Logger logger = LoggerFactory.getLogger(SomeServiceImpl2.class);

    @Override
    public void execute() {
        logger.info("Executing service implementation 2");
    }

}