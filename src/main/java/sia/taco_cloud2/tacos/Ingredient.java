package sia.taco_cloud2.tacos;


import lombok.Data;

@Data
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;


    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
