package sia.taco_cloud2.tacos;

import lombok.Data;
import sia.taco_cloud2.tacos.Ingredient;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
    
}
