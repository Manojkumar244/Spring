package org.example;

import org.Config.ProjectConfig;
import org.beans.Person;
import org.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
Vehicle v1=context.getBean(Vehicle.class);
Person p1=context.getBean(Person.class);
System.out.println("vehicle name "+v1.getName());
System.out.println("Person name "+p1.getName());
System.out.println(p1.getVehicle());
    }
}