package sia.taco_cloud2.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud2.web.TacoOrder;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
