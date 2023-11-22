package com.programmingtechie.orderservice.service;

import com.programmingtechie.orderservice.dto.OrderRequest;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public void placeOrder(OrderRequest orderRequest);
}
