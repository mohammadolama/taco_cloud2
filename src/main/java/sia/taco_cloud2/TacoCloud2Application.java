package sia.taco_cloud2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import sia.taco_cloud2.data.IngredientRepository;
import sia.taco_cloud2.data.TacoRepository;
import sia.taco_cloud2.data.UserRepository;
import sia.taco_cloud2.tacos.Ingredient;
import sia.taco_cloud2.tacos.Ingredient.Type;
import sia.taco_cloud2.tacos.Taco;
import sia.taco_cloud2.web.WebConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TacoCloud2Application extends WebConfig {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloud2Application.class, args);
    }

//    @Bean
//    public CommandLineRunner dataLoader(IngredientRepository repo) {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//                repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//                repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//                repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//                repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//                repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//                repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//                repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//                repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//                repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//            }
//        };
//    }

    @Bean
    public CommandLineRunner dataLoader(
            IngredientRepository repo,
            UserRepository userRepo,
            PasswordEncoder encoder,
            TacoRepository tacoRepo) {
        return args -> {
            Ingredient flourTortilla = new Ingredient(
                    "FLTO", "Flour Tortilla", Type.WRAP);
            Ingredient cornTortilla = new Ingredient(
                    "COTO", "Corn Tortilla", Type.WRAP);
            Ingredient groundBeef = new Ingredient(
                    "GRBF", "Ground Beef", Type.PROTEIN);
            Ingredient carnitas = new Ingredient(
                    "CARN", "Carnitas", Type.PROTEIN);
            Ingredient tomatoes = new Ingredient(
                    "TMTO", "Diced Tomatoes", Type.VEGGIES);
            Ingredient lettuce = new Ingredient(
                    "LETC", "Lettuce", Type.VEGGIES);
            Ingredient cheddar = new Ingredient(
                    "CHED", "Cheddar", Type.CHEESE);
            Ingredient jack = new Ingredient(
                    "JACK", "Monterrey Jack", Type.CHEESE);
            Ingredient salsa = new Ingredient(
                    "SLSA", "Salsa", Type.SAUCE);
            Ingredient sourCream = new Ingredient(
                    "SRCR", "Sour Cream", Type.SAUCE);
            repo.save(flourTortilla);
            repo.save(cornTortilla);
            repo.save(groundBeef);
            repo.save(carnitas);
            repo.save(tomatoes);
            repo.save(lettuce);
            repo.save(cheddar);
            repo.save(jack);
            repo.save(salsa);
            repo.save(sourCream);

            Taco taco1 = new Taco();
            taco1.setName("Carnivore");
            taco1.setIngredients(Arrays.asList(
                    flourTortilla, groundBeef, carnitas,
                    sourCream, salsa, cheddar));
            tacoRepo.save(taco1);
            Taco taco2 = new Taco();
            taco2.setName("Bovine Bounty");
            taco2.setIngredients(Arrays.asList(
                    cornTortilla, groundBeef, cheddar,
                    jack, sourCream));
            tacoRepo.save(taco2);
            Taco taco3 = new Taco();
            taco3.setName("Veg-Out");
            taco3.setIngredients(Arrays.asList(
                    flourTortilla, cornTortilla, tomatoes,
                    lettuce, salsa));
            tacoRepo.save(taco3);
        };
    }

}
