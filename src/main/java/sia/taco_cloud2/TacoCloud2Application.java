package sia.taco_cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sia.taco_cloud2.web.WebConfig;

@SpringBootApplication
public class TacoCloud2Application extends WebConfig {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloud2Application.class, args);
    }

}
