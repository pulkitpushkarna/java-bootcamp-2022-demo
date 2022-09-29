package com.bootrcamp.demo;

public class Employee {

    Integer id;
    Integer age;
    String name;

    public Employee(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
