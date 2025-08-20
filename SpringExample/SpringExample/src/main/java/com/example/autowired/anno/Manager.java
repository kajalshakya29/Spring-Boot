package com.example.autowired.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    //field injection
    @Autowired
    @Qualifier("employee")// --->> if we have multiple beans register with the same type with different names
    private Employee employee;

    //constructor injection ---> mostly recommended
    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
