package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Armstrong");

        Product product = new Book("Brant Weeks", "Shadow's Edge", new BigDecimal(25));

        Integer quantity = 2;

        return new OrderRequest(user, product, quantity);
    }
}
