package sia.taco_cloud2.data;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.taco_cloud2.tacos.Ingredient;
import sia.taco_cloud2.tacos.IngredientUDT;

import java.util.Optional;

@Component
public class StringToIngredientConverter implements Converter<String, IngredientUDT> {

  private IngredientRepository ingredientRepository;

  public StringToIngredientConverter(IngredientRepository ingredientRepository) {
    this.ingredientRepository = ingredientRepository;
  }
  
  @Override
  public IngredientUDT convert(String id) {
    Optional<Ingredient> ingredient = ingredientRepository.findById(id);
    if (ingredient.isEmpty()) {
      return null;
    }
    
    return ingredient.map(i -> {
      return new IngredientUDT(i.getName(), i.getType());
    }).get();
  }
  
}
