package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//Source : https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
@SpringBootApplication
@EnableJpaAuditing
public class JpaOneToManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaOneToManyApplication.class, args);
    }

}
