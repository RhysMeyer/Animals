package com.TSI.Rhys.Meyer.AnimalTesting;

import com.TSI.Rhys.Meyer.Animals.Cat;
import com.TSI.Rhys.Meyer.Animals.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTests {

    @Test
    public void EatTest(){
        Cat c = new Cat();
        c.setSize(10);
        c.eat("food");
        assertEquals(11,c.getSize(),"This cat's size is too big");

    }

    public void AgeTest(){
        Bat b = new Bat();
        b.setAge(10);
        assertEquals(10,b.getAge(),"This Bat's age isnt right");

    }
}
