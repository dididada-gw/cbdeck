package com.cbdeck.cbdeckserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cbdeck.cbdeckserver")
@MapperScan("com.cbdeck.cbdeckserver.systemmanager.mapper")
public class CbdeckserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbdeckserverApplication.class, args);
    }

}
