package com.xebia;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld {
    static final Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args){
        BasicConfigurator.configure();
        Greeter greeter = new Greeter();
        String msg = greeter.sayHello("Pushpendu");
        logger.info(msg);
    }
}