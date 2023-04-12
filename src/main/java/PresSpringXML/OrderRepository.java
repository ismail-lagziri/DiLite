package PresSpringXML;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    Map<Integer, Order> orderIdToOrderMap = new HashMap<>();

    public OrderRepository() {
        orderIdToOrderMap.put(1, new Order(1, "", 10.0));
        orderIdToOrderMap.put(2, new Order(2, "", 20.0));
        orderIdToOrderMap.put(3, new Order(2, "", 30.0));
        orderIdToOrderMap.put(4, new Order(2, "", 40.0));
    }

    public Order getById(Integer orderId) {
        return orderIdToOrderMap.get(orderId);
    }
}
