package com.hrithik.BuilderDp.version1;

public class EmployeeBuilder {
    String name;
    String emp_id;
    double salary;
    int yoe;
    String email;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getemp_id() {
        return emp_id;
    }

    public void setemp_id(String emp_id) {
        this.emp_id = emp_id;
    }

//    public Employee build(){
//        return new Employee(this);
//    }
}
