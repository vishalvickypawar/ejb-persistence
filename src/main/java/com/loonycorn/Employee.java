package com.loonycorn;

import javax.persistence.Entity;

import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    private int id;

    private String name;
    private String position;
    private float salary;

    public Employee(){

    }

    public Employee(int id, String name, String position, float salary){
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public float getSalary() {
        return salary;
    }
}
