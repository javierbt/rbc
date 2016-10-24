package com.bracero.rbc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by bracero on 24/10/2016.
 */
public class BasketTest {
    @Test
    public void allTypes() {
        List<Fruit> fruits = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.Apple, 10));
            add(new Fruit(Fruit.Type.Banana, 20));
            add(new Fruit(Fruit.Type.Lemon, 30));
            add(new Fruit(Fruit.Type.Orange, 40));
            add(new Fruit(Fruit.Type.Peache, 50));
        }};
        assertEquals(150, new Basket(fruits).totalCost());
    }

    @Test
    public void repeated() {
        List<Fruit> fruits = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.Apple, 10));
            add(new Fruit(Fruit.Type.Apple, 10));
            add(new Fruit(Fruit.Type.Apple, 30));
            add(new Fruit(Fruit.Type.Orange, 40));
        }};
        assertEquals(90, new Basket(fruits).totalCost());
    }

    @Test
    public void allNegative() {
        List<Fruit> fruits = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.Apple, -5));
            add(new Fruit(Fruit.Type.Banana, -20));
            add(new Fruit(Fruit.Type.Lemon, -30));
            add(new Fruit(Fruit.Type.Orange, -40));
            add(new Fruit(Fruit.Type.Peache, -50));
        }};
        assertEquals(0, new Basket(fruits).totalCost());
    }

    @Test
    public void mixed() {
        List<Fruit> fruits = new ArrayList<Fruit>() {{
            add(new Fruit(Fruit.Type.Apple, 10));
            add(new Fruit(Fruit.Type.Apple, -10));
            add(new Fruit(Fruit.Type.Apple, 30));
            add(new Fruit(Fruit.Type.Orange, -40));
        }};
        assertEquals(40, new Basket(fruits).totalCost());
    }

    @Test
    public void empty() {
        List<Fruit> fruits = new ArrayList<Fruit>();
        assertEquals(0, new Basket(fruits).totalCost());
    }
}
