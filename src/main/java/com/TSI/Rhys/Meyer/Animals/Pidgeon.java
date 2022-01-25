package com.TSI.Rhys.Meyer.Animals;

public class Pidgeon extends Bird implements Flying{


    @Override
    public Animal Reproduce() {
        return null;
    }

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
        return "Catch Worms";
    }
}
