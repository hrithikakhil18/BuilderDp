package com.hrithik.BuilderDp.version2;

import com.hrithik.BuilderDp.version2.EmployeeBuilder;

public class Employee {
    String name;
    String emp_id;
    double salary;
    int yoe;
    String email;

    public Employee(EmployeeBuilder eb){
        this.name = eb.name;

        if(eb.getemp_id().length()<7){
            throw new IllegalArgumentException("Length of emp id must be equal to seven");
        }else{
            this.emp_id = eb.getemp_id();
        }
        this.salary = eb.salary;
        this.email = eb.email;
        this.yoe = eb.yoe;
    }
}
