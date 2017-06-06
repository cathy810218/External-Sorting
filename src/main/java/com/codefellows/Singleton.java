package com.codefellows;

/**
 * Created by cathyoun on 6/5/17.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
