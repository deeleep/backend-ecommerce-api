package com.dmeh.ecommerce.kafka;

import com.dmeh.ecommerce.customer.CustomerResponse;
import com.dmeh.ecommerce.order.PaymentMethod;
import com.dmeh.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
// Refactor OrderService for cleaner logic
