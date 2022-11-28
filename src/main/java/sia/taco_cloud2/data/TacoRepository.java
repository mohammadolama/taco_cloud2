package sia.taco_cloud2.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import sia.taco_cloud2.tacos.Taco;

import java.util.UUID;

public interface TacoRepository extends PagingAndSortingRepository<Taco, String> {
}
