package com.lidigu.ecommerce.kafka;

import com.lidigu.ecommerce.customer.CustomerResponse;
import com.lidigu.ecommerce.order.PaymentMethod;
import com.lidigu.ecommerce.product.PurchaseResponse;

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
