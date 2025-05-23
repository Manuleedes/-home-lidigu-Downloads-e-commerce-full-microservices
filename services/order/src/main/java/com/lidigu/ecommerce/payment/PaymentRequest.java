package com.lidigu.ecommerce.payment;

import com.lidigu.ecommerce.customer.CustomerResponse;
import com.lidigu.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
