package sia.taco_cloud2.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud2.web.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder , Long> {

}
