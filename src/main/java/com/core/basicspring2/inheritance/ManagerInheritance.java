package com.core.basicspring2.inheritance;

public class ManagerInheritance extends EmployeeInheritance {

    private  int teamSize;

    public ManagerInheritance(String department, String name, String email, int teamSize) {
        super(department, name, email);
        this.teamSize = teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public String toString() {
        return "ManagerInheritance{" +
                "teamSize=" + teamSize + ", " + super.toString() +
                '}';
    }
}
