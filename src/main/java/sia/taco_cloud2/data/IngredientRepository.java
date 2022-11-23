package sia.taco_cloud2.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import sia.taco_cloud2.tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient , String> {
}
