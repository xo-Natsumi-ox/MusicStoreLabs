package ua.lviv.iot.musicStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.dataaccess", "ua.lviv.iot.business", "ua.lviv.iot.musicStore.controller"})
@EnableJpaRepositories({"ua.lviv.iot.dataaccess"})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
