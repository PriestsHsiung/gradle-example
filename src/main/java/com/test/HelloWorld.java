package com.test;


import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2016/8/10 0010.
 */
public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}
