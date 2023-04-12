package PresSpringAnnotation;

import annotations.SimpleComponent;
import annotations.SimplyAutoWired;

@SimpleComponent
public class OrderService {

    @SimplyAutoWired
    private OrderRepository repository;

    public Order getOrderDetails(Integer orderId) {
        return repository.getById(orderId);
    }
}