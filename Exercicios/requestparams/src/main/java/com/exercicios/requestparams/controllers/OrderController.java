package com.exercicios.requestparams.controllers;

import com.exercicios.requestparams.entities.Order;
import com.exercicios.requestparams.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getOrders(
            @RequestParam(value = "order_number", required = false) Integer orderNumber,
            @RequestParam(value = "customer_name", required = false) String customerName,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "min_amount", required = false) Integer minAmount,
            @RequestParam(value = "max_amount", required = false) Integer maxAmount,
            @RequestParam(value = "start_date", required = false) LocalDate startDate,
            @RequestParam(value = "end_date", required = false) LocalDate endDate

    ) {
        return ResponseEntity.ok(orderService.getAllOrders(orderNumber, customerName, status, minAmount, maxAmount, startDate, endDate));
    }
}
