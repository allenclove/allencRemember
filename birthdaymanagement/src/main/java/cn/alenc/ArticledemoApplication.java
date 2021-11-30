package cn.alenc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class ArticledemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticledemoApplication.class, args);
    }
}
