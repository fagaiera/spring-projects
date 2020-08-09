package com.fabiogaiera.initdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CachingMovieListerImpl implements CachingMovieLister {

    @Override
    @PostConstruct
    public void populateMovieCache() {
        System.out.println("Populating Movie Cache with @PostConstruct annotation");
    }

    @Override
    public void start() {
        System.out.println("Starting!");
    }

    @Override
    @PreDestroy
    public void clearMovieCache() {
        System.out.println("Clearing Movie Cache with @PreDestroy annotation");
    }

}