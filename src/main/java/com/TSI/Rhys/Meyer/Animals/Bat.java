package com.TSI.Rhys.Meyer.Animals;

public class Bat extends Mammal implements Flying{


    @Override
    public String takeoff() {
        return "takeoff";

    }

    @Override
    public String landing() {
        return "landing";
    }

    @Override
    public String flight() {
        return "flight";
    }

    public String Hunt(){
        return "Catch Bugs";
    }
}
