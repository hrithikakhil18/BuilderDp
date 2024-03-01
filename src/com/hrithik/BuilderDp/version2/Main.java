package com.hrithik.BuilderDp.version2;

import com.hrithik.BuilderDp.version2.Employee;
import com.hrithik.BuilderDp.version2.EmployeeBuilder;

public class Main {
    public static void main(String[] args) {

        EmployeeBuilder eb = new EmployeeBuilder();
        eb.setName("Hrithik");
        eb.setemp_id("2174623");
        eb.setEmail("hrithikm@gmail.com");
        eb.setYoe(5);
        eb.setSalary(100000);


        Employee e1 = eb.build();
        System.out.println(e1.name + " " + e1.emp_id + " " + e1.yoe +" "+ e1.email + " "+ e1.salary);

    }
}
