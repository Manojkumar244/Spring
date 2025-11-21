package org.beans;

public class Vehicle {
    private String name;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public Vehicle()
    {
        System.out.println("vehicle is created");

    }
    public String toString()
    {
        return "Vehicle is "+name;
    }
}
