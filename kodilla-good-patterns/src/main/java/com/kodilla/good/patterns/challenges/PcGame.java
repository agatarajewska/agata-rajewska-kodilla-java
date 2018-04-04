package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class PcGame implements Product {

    private String company;
    private String title;
    private BigDecimal price;

    public PcGame(String company, String title, BigDecimal price) {
        this.company = company;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PcGame {company='" + company + '\'' + ", title='" + title + '\'' + ", price=" + price + '}';
    }
}