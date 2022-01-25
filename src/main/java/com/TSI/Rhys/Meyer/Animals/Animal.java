package com.TSI.Rhys.Meyer.Animals;

public abstract class Animal {

    ////////////////////////////////////Attributes///////////////////////////////////
    private int age;
    private int weight;



    ////////////////////////////////////Constructors/////////////////////////////////






    /////////////////////////////////////Methods/////////////////////////////////////
    public abstract void eat(String food);

    public void sleep(int time){
        //this.wait(time);
    }

    public abstract String Hunt();

    public abstract Animal Reproduce();

    public abstract String Breathe();

    public String excrete(){
        return "poo";
    }

    public void die(){
        //DIE
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getWeight(){
        return weight;
    }

    public void setWeight(int size)
    {
        this.weight = size;
    }
}
