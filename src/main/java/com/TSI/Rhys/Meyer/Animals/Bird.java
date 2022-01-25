package com.TSI.Rhys.Meyer.Animals;

abstract class Bird extends Animal{

    public String Breathe()
    {
        return ("Breathes like bird");
    }

    public void eat(String food){
        this.setWeight(this.getWeight()+2);
    }
    public Animal Reproduce() {
        return null;
    }
}
