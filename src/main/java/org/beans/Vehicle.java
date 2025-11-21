package org.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="Honda";
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
