package org.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Manoj";
    //@Autowired
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
    @Autowired
    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle=vehicle;

    }
    public Vehicle getVehicle()
    {
return vehicle;
    }


}
