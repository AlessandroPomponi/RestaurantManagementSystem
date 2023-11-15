package org.yi.dto;

public class Beverage {
    private static int nextId = 1;
    private String id;
    private String name;
    private double price;
    private boolean alcohol;

    public Beverage(String id, String name, double price, boolean alcohol) {
        this.id = String.format("D%03D", nextId++);
        this.name = name;
        this.price = price;
        this.alcohol = alcohol;
    }
}
