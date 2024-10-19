package com.core.basicspring2.inheritance;

public class PersonInheritance {

    private String name;
    private String email;

    public PersonInheritance(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PersonInheritance{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
