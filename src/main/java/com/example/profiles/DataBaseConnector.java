package com.example.profiles;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DataBaseConnector {


    @Value("${spring.datasource.url}")
    private String jdbcUrl;


    public void connect(){
        System.out.println(jdbcUrl);
    }
    @PostConstruct
    public void init(){
        connect();
    }


}
