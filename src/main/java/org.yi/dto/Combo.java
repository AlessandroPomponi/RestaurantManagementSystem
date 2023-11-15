package org.yi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Combo {
    private static final int MAX_DISH_NUM = 20;
    private static final int MAC_BEVERAGE_NUM = 20;
    private int dishNum = 0;
    private static int nextId = 1;
    private String id;
    private String name;
    private double price;
    private Dish[] dishes;
    private Beverage[] beverages;

    public Dish(String id, String name, double price, FoodType foodType) {
        this.id = String.format("D%03D", nextId++);
        this.name = name;
        this.dishes = new Dish[MAX_DISH_NUM];
        this.beverages = new Beverage[MAC_BEVERAGE_NUM];
    }

    public void addDish(Dish dish) {
        if (dishes[0] == null) {
            dishes[0] = dish;
        } else if (dishes[1] == null) {
            dishes[1] = dish;
        } else {
            System.out.printf("There are already %d dishes, add dishes failed", MAX_DISH_NUM);
        }
    }

    public void calcPrice() {
        double price = 0;

        for (Beverage beverage : beverages) {
            price += beverage.getPrice();
        }

        for (Dish dish : dishes)

        double discountRatio = 0.0;
        this.price = price * discountRatio;
    }


}
