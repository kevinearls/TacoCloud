package dev.kearls.tacocloud2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TacoCloud2Application {

    public static void main(String[] args) {
        log.info(">>>>>>>>> Starting now <<<<<<<<<<");
        SpringApplication.run(TacoCloud2Application.class, args);
    }

}
