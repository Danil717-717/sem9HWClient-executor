package ru.springgb.clientexecutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("ru.springgb.cliententity.model")
public class ClientExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientExecutorApplication.class, args);
    }

}
