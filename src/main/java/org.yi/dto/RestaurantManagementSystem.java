package org.yi.dto;

import java.util.Arrays;

@Getter
@Setter
@Equals
public class RestaurantManagementSystem {
    private static final int MAX_COMBO_NUM = 20;
    private int comboNum = 0;
    private Combo[] combos;
    public RestaurantManagementSystem() {
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo(Combo combo) {
        if (comboNum < MAX_COMBO_NUM) {
            // add the combo
            combos[comboNum] = combo;
        } else {
            // reached the cap
            System.out.printf("There are %d combos already. Add combo failed", MAX_COMBO_NUM);
        }
    }

    @Override
    public String toString() {
        String comboStr = "[";
        for (Combo combo : combos) {
            if (combo != null) {
                comboStr += combo + ", ";
            }
        }
        comboStr += "]";

        return "RestaurantManagementSystem{" +
                "combos=" + comboStr +
                '}';
    }
}
