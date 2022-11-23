package sia.taco_cloud2.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud2.tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient , String> {
}
