package com.dmeh.ecommerce.orderline;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity
) {
}
// Add filtering and sorting of orders
