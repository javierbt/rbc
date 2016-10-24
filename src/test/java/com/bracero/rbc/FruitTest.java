package com.bracero.rbc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bracero on 24/10/2016.
 */
public class FruitTest {
    @Test
    public void testGetUnitCost() {
        assertEquals(10, new Fruit(Fruit.Type.Apple, 10).getUnitCost().intValue());
    }
}
