package com.bootrcamp.demo;


interface EmployeeFI {

    Employee createEmployee(Integer id, Integer age, String name);
}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        EmployeeFI employeeFI = Employee::new;
        Employee employee = employeeFI.createEmployee(1, 32, "Peter Parker");
        System.out.println(employee);


    }
}
