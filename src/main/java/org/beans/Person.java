package org.beans;

public class Person {
    private String name;
    private Vehicle vehicle;


    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public Person()
    {
        System.out.println("person is created");
    }
    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;

    }
    public Vehicle getVehicle()
    {
return vehicle;
    }


}
