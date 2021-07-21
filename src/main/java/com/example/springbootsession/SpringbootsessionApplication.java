package com.example.springbootsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@EnableJdbcHttpSession

@SpringBootApplication
public class SpringbootsessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsessionApplication.class, args);
    }

}
