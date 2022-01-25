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
        Pidgeon p = new Pidgeon();
        p.setWeight(10);
        p.eat("food");
        assertEquals(12,p.getWeight(),"This Pidgeon's size is too big");

    }

    @Test
    public void AgeTest(){
        Bat b = new Bat();
        b.setAge(10);
        assertEquals(10,b.getAge(),"This Bat's age isnt right");
        Cat c = new Cat();
        c.setAge(10);
        assertEquals(10,c.getAge(),"This Cat's age isnt right");

    }

    @Test
    public void BreathingTest(){
        Pidgeon pi = new Pidgeon();
        Cat c = new Cat();
        Bat b = new Bat();
        Penguin pe = new Penguin();
        assertEquals("Breathes like bird",pi.Breathe(),"This Pidgeon is not breathing");
        assertEquals("Breathes like bird",pe.Breathe(),"This Penguin is not breathing");
        assertEquals("Breathes like mammal",c.Breathe(),"This Cat is not breathing");
        assertEquals("Breathes like mammal",b.Breathe(),"This Bat is not breathing");

    }

    @Test
    public void Hunting(){
        Pidgeon pi = new Pidgeon();
        Cat c = new Cat();
        Bat b = new Bat();
        Penguin pe = new Penguin();
        assertEquals("Catch Worms",pi.Hunt(),"Wrong Food for Pidgeon");
        assertEquals("Catch Fish",pe.Hunt(),"Wrong Food for Penguin");
        assertEquals("Catch Bugs",b.Hunt(),"Wrong Food for Bat");
        assertEquals("Catch Mouse",c.Hunt(),"Wrong Food for Cat");

    }

    @Test
    public void TakeoffTest(){
        Pidgeon pi = new Pidgeon();
        Bat b = new Bat();
        assertEquals("takeoff",pi.takeoff(),"No takeoff");
        assertEquals("takeoff",b.takeoff(),"No takeoff");

    }

    @Test
    public void LandingTest(){
        Pidgeon pi = new Pidgeon();
        Bat b = new Bat();
        assertEquals("landing",pi.landing(),"No landing");
        assertEquals("landing",b.landing(),"No landing");

    }

    @Test
    public void FlightTest(){
        Pidgeon pi = new Pidgeon();
        Bat b = new Bat();
        assertEquals("flight",pi.flight(),"No flight");
        assertEquals("flight",b.flight(),"No flight");

    }


}
