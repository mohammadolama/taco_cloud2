package sia.taco_cloud2.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.taco_cloud2.data.IngredientRepository;
import sia.taco_cloud2.tacos.Ingredient;


@Slf4j
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        Ingredient ingredient = ingredientRepo.findById(id).orElse(null);
        log.info("ingredient converted: " + ingredient);
        return ingredient;
    }
}
