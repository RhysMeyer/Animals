package com.TSI.Rhys.Meyer.Animals;

public abstract class Animal {

    ////////////////////////////////////Attributes///////////////////////////////////
    private int age;
    private int size;



    ////////////////////////////////////Constructors/////////////////////////////////






    /////////////////////////////////////Methods/////////////////////////////////////
    public abstract void eat(String food);

    public void sleep(int time){
        //this.wait(time);
    }

    public abstract Animal reproduce();

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


    public int getSize(){
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }
}
