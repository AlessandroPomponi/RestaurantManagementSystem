package org.yi.dto;

@Equals
@ToStri
@Getter
@Setter
public class Dish {
    private static int nextId = 1;
    private String id;
    private String name;
    private double price;
    private FoodType foodType;

    public Dish(String id, String name, double price, FoodType foodType) {
        this.id = String.format("D%03D", nextId++);
        this.name = name;
        this.price = price;
        this.foodType = foodType;
    }
}
