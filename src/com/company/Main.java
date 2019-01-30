package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Planet earth = new Planet("Earth", 7000000000L);
        System.out.println("Population of " + earth.getName() + ": " + earth.getPopulation());

        Planet pluto = new Planet("Pluto", 3);
        System.out.println("Population of " + pluto.getName() + ": " + pluto.getPopulation());
    }
}
