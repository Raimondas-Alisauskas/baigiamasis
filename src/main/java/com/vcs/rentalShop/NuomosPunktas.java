package com.vcs.rentalShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan({ "com.vcs.*" })

public class NuomosPunktas {

    public static void main(String[] args) {




        SpringApplication.run(NuomosPunktas.class, args);





    }
}
