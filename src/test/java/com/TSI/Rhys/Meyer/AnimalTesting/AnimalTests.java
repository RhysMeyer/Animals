package com.TSI.Rhys.Meyer.AnimalTesting;

import com.TSI.Rhys.Meyer.Animals.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTests {

    @Test
    void EatTest(){
        Cat c = new Cat();
        c.setSize(10);
        c.eat("food");
        assertEquals(11,c.getSize(),"This cat's size is too big");

    }
}
