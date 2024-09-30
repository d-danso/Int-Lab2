package org.example.designPatterns.singleton;

public class Main {

    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        logger.log("application started");
        logger.log("performing operation 1");
        logger.log("shutting down");
    }
}
