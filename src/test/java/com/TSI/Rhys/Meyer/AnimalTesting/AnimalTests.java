package com.TSI.Rhys.Meyer.AnimalTesting;

import com.TSI.Rhys.Meyer.Animals.Cat;
import com.TSI.Rhys.Meyer.Animals.Bat;
import com.TSI.Rhys.Meyer.Animals.Penguin;
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

    @Test
    public void BreathingTest(){
        Pidgeon pi = new Pidgeon();
        Cat c = new Cat();
        Bat b = new Bat();
        Penguin pe = new Penguin();
        assertEquals("Breathes like bird",pi.Breathe(),"This Pidgeon is not breathing");
        assertEquals("Breathes like bird",pe.Breathe(),"This Penguin is not breathing");
        assertEquals("Breathes like bird",c.Breathe(),"This Cat is not breathing");
        assertEquals("Breathes like bird",b.Breathe(),"This Bat is not breathing");

    }

    @Test
    public void Hunting(){
        Pidgeon pi = new Pidgeon();
        Cat c = new Cat();
        Bat b = new Bat();
        Penguin pe = new Penguin();
        assertEquals("Catch Worms",pi.Hunt(),"Wrong Food for Pidgeon");
        assertEquals("Catch Fish",pe.Hunt(),"Wrong Food for Penguin");
        assertEquals("Catch Mouse",b.Hunt(),"Wrong Food for Bat");
        assertEquals("Catch Bugs",c.Hunt(),"Wrong Food for Cat");

    }


}
