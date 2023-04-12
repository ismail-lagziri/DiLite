package PresSpringXML;

import annotations.SimplyAutoWired;

public class OrderService {

    @SimplyAutoWired
    private OrderRepository repository;

    public Order getOrderDetails(Integer orderId) {
        return repository.getById(orderId);
    }

}
