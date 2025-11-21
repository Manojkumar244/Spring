package org.Config;


import org.beans.Person;
import org.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle()
    {
        Vehicle v1=new Vehicle();
        v1.setName("Honda");
        return v1;
    }
    @Bean
    Person person()
    {
        Person p1=new Person();
        p1.setName("Manoj");
        p1.setVehicle(vehicle());
        return p1;
    }


}
