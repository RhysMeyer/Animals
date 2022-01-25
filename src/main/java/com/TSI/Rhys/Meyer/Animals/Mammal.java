package com.TSI.Rhys.Meyer.Animals;

abstract class Mammal extends Animal {

    ///////////////////////////////////Attributes/////////////////////////////////////////





    ///////////////////////////////////Constructors/////////////////////////////////////////





    ///////////////////////////////////Methods/////////////////////////////////////////////

    public void eat(String food){
        this.setWeight(this.getWeight()+1);
    }

    public String Breathe()
    {
        return ("Breathes like mammal");
    }

    public Animal Reproduce()
    {
        return null;
    }
}

