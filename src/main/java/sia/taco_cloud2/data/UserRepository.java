package sia.taco_cloud2.data;

import org.springframework.data.repository.CrudRepository;
import sia.taco_cloud2.User;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
    User findByUsername(String username);
}
