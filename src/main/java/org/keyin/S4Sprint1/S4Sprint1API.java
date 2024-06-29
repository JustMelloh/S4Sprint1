package org.keyin.S4Sprint1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class S4Sprint1API {

    public static void main(String[] args) {
        SpringApplication.run(S4Sprint1API.class, args);
    }

}
