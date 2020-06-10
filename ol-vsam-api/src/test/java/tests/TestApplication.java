package tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Simple application to bootstrap tests
 */
@ComponentScan({"com.vsam_api.openlegacy"})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    /*@Bean
    public ObjectService getObjectService() {
       return new ObjectServiceImpl();
    }*/
}
