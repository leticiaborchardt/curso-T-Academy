package com.exercicios.requestparams.specifications;

import com.exercicios.requestparams.entities.Order;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public class OrderSpecification {
    public static Specification<Order> hasOrderNumber(Integer orderNumber) {
        return (root, query, cb) ->
                orderNumber == null
                        ? null
                        : cb.equal(root.get("orderNumber"), orderNumber);
    }

    public static Specification<Order> customerNameContains(String customerName) {
        return (root, query, cb) ->
                customerName == null
                        ? null
                        : cb.like(cb.lower(root.get("customerName")), "%" + customerName.toLowerCase() + "%");
    }

    public static Specification<Order> hasStatus(String status) {
        return (root, query, cb) ->
                status == null
                        ? null
                        : cb.equal(cb.lower(root.get("status")), status.toLowerCase());
    }

    public static Specification<Order> hasAmountRange(Integer minAmount, Integer maxAmount) {
        return hasRange("totalAmount", minAmount, maxAmount);
    }

    public static Specification<Order> hasDateRange(LocalDate startDate, LocalDate endDate) {
        return hasRange("orderDate", startDate, endDate);
    }

    private static <T extends Comparable<? super T>> Specification<Order> hasRange(String attributeName, T minValue, T maxValue) {
        return (root, query, cb) -> {
            if (minValue != null && maxValue != null) {
                return cb.between(root.get(attributeName), minValue, maxValue);
            } else if (minValue != null) {
                return cb.greaterThanOrEqualTo(root.get(attributeName), minValue);
            } else if (maxValue != null) {
                return cb.lessThanOrEqualTo(root.get(attributeName), maxValue);
            }

            return null;
        };
    }
}
