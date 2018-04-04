package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Product product, final Integer quantity) {
        System.out.println("Order by " + user.getName() + " " + user.getSurname() +
                " Item: " + product.toString() + " Quantity: " + quantity);
        return true;
    }

}