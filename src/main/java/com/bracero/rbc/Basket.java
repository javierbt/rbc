package com.bracero.rbc;

import java.util.List;

/**
 * Created by bracero on 24/10/2016.
 */
public final class Basket {

    List<Fruit> fruits;

    public Basket(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public int totalCost() {
        return fruits.stream().
                filter(b -> b.getUnitCost() > 0).
                mapToInt(Fruit::getUnitCost).
                sum();
    }
}
