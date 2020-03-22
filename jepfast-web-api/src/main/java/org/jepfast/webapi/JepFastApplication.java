package org.jepfast.webapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.jepfast.*"})
public class JepFastApplication {

    public static void main(String[] args) {
        SpringApplication.run(JepFastApplication.class, args);
    }
}


