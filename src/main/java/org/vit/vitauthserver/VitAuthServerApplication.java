package org.vit.vitauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class VitAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VitAuthServerApplication.class, args);
    }
}
