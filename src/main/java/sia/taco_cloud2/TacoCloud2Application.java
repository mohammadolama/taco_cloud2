package sia.taco_cloud2;

import com.datastax.oss.driver.api.core.config.DefaultDriverOption;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.DriverConfigLoaderBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import sia.taco_cloud2.data.IngredientRepository;
import sia.taco_cloud2.tacos.Ingredient;
import sia.taco_cloud2.web.WebConfig;
import sia.taco_cloud2.tacos.Ingredient.Type;

@SpringBootApplication
public class TacoCloud2Application extends WebConfig {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloud2Application.class, args);
    }

//    @Bean
//    public DriverConfigLoaderBuilderCustomizer defaultProfile(){
//        return builder -> builder.withString(DefaultDriverOption.METADATA_SCHEMA_REQUEST_TIMEOUT, "15 seconds").build();
//    }

    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
                repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
                repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
                repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
                repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
                repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
                repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
                repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
                repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
                repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
            }
        };
    }
}
