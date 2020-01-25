package com.heroku.filextract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilextractApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilextractApplication.class, args);
        System.out.println("Hello Filextract");
    }

}
