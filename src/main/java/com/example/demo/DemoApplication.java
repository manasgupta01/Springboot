package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Get the application context to retrieve the HelloWorldController bean
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // Retrieve the HelloWorldController bean from the Spring context
//        HelloWorldController hs = context.getBean(HelloWorldController.class);
//
//        // Call the helloWorld method
//        System.out.println(hs.helloWorld());

        // Another simple system out
        System.out.println("Application started successfully!");
    }
}
