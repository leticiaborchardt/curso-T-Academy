package com.exercicios.requestparams.services;

import com.exercicios.requestparams.entities.Order;
import com.exercicios.requestparams.repositories.OrderRepository;
import com.exercicios.requestparams.specifications.OrderSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(Integer orderNumber, String customerName, String status, Integer minAmount, Integer maxAmount, LocalDate startDate, LocalDate endDate) {
        Specification<Order> spec = Specification
                .where(OrderSpecification.hasOrderNumber(orderNumber))
                .and(OrderSpecification.customerNameContains(customerName))
                .and(OrderSpecification.hasStatus(status))
                .and(OrderSpecification.hasAmountRange(minAmount, maxAmount))
                .and(OrderSpecification.hasDateRange(startDate, endDate));

        return orderRepository.findAll(spec);
    }
}
