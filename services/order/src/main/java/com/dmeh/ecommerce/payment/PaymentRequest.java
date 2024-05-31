package com.dmeh.ecommerce.payment;

import com.dmeh.ecommerce.customer.CustomerResponse;
import com.dmeh.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
// Add Docker container UI screenshot
