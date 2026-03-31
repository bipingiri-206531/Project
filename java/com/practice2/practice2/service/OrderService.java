package com.practice2.practice2.service;

import com.practice2.practice2.entity.Order;
import com.practice2.practice2.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public Order saveOrder(Order order) {
       return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order updatedOrder(Long id, Order updatedOrder) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null ) {
            existingOrder.setOrderDate(updatedOrder.getOrderDate());
            existingOrder.setTotalAmount(updatedOrder.getTotalAmount());
            return orderRepository.save(existingOrder);
        }
        return null;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
