package pl.edu.wszib.orders.api.order;

import java.util.Optional;

public interface OrderFacadeApi {
    OrderApi create();
    Optional<OrderApi> addItem(String orderId, String productId);
    OrderApi removeItem(String orderId, String productId);
    Optional<OrderApi> findById(String orderId);
}
