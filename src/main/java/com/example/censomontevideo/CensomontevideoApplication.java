package com.example.censomontevideo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "com.example.censomontevideo")
@EntityScan(basePackages = "com.example.censomontevideo.entity")
public class CensomontevideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CensomontevideoApplication.class, args);
    }
}
