package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, Product product, Integer quantity) {
        System.out.println("Creating order in database....");
    }

}
