package com.mic.app.service;

import com.mic.app.model.Order;

import java.util.List;

public interface OrderService {

    public List<Order> findAll();

    public Order save(Order order);

}
