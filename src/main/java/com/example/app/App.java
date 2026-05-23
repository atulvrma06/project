package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        String name = "CI/CD Pipeline";

        if (StringUtils.isNotBlank(name)) {

            String message = greet(name);

            logger.info(message);

            System.out.println(message);

            System.out.println(
                "Current Time: " + LocalDateTime.now()
            );

            System.out.println(
                "Uppercase Name: " + name.toUpperCase()
            );

        } else {

            logger.error("Name is empty!");
        }

        logger.info("Application Finished");
    }

    public static String greet(String name) {

        return "Hello, " + name
                + "! Welcome to Maven CI/CD Demo.";
    }
}
