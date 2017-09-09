package com.mic.app.controller;

import com.mic.app.dao.OrderRepository;
import com.mic.app.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Order save(@RequestBody Order order) {
        return orderRepository.save(order);
    }

}
