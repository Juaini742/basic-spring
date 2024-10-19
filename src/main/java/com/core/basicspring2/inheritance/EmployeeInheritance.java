package com.core.basicspring2.inheritance;

public class EmployeeInheritance extends PersonInheritance {

    private String department;

    public EmployeeInheritance(String department, String name, String email) {
        super(name, email);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "EmployeeInheritance{" +
                "department='" + department + ", " + super.toString() + '\'' +
                '}';
    }
}
