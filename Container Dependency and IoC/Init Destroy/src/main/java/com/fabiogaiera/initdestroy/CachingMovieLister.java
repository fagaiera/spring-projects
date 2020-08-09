package com.fabiogaiera.initdestroy;

public interface CachingMovieLister {

    void populateMovieCache();

    void start();

    void clearMovieCache();

}