package com.TSI.Rhys.Meyer.AnimalTesting;

import com.TSI.Rhys.Meyer.Animals.Cat;
import com.TSI.Rhys.Meyer.Animals.Bat;
import com.TSI.Rhys.Meyer.Animals.Pidgeon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTests {

    @Test
    public void EatTest(){
        Cat c = new Cat();
        c.setWeight(10);
        c.eat("food");
        assertEquals(11,c.getWeight(),"This cat's size is too big");

    }

    @Test
    public void AgeTest(){
        Bat b = new Bat();
        b.setAge(10);
        assertEquals(10,b.getAge(),"This Bat's age isnt right");

    }

    public void Breathing(){
        Pidgeon p = new Pidgeon();
        assertEquals("Breathes like bird",p.Breathe(),"This Bat's age isnt right");

    }
}
