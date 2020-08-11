package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableConfigServer
public class ConfigServer_3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_3344.class,args);
    }
}
