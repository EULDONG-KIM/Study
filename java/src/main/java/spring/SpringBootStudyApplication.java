package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("spring.*")
@EnableCaching
public class SpringBootStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }
}
