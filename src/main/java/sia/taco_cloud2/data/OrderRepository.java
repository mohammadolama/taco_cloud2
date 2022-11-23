package sia.taco_cloud2.data;

import sia.taco_cloud2.web.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
