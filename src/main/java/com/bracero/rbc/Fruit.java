package com.bracero.rbc;

/**
 * Created by bracero on 24/10/2016.
 */
final class Fruit {

    enum Type {
        Banana, Orange, Apple, Lemon, Peache;
    }

    final Type type;
    final Integer unitCost;

    public Fruit(Type type, Integer unitCost) {
        this.type = type;
        this.unitCost = unitCost;
    }

    public Integer getUnitCost() {
        return unitCost;
    }
}
