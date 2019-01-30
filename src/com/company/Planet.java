package com.company;

public class Planet
{
    private long population;
    private String name;

    public Planet(String name, long population)
    {
        this.name = name;
        this.population = population;
        System.out.println("I'm a new planet and my name is " + name);
    }

    public long getPopulation()
    {
        return population;
    }

    public String getName()
    {
        return name;
    }
}
