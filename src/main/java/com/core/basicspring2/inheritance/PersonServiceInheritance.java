package com.core.basicspring2.inheritance;


import org.springframework.stereotype.Service;

@Service
public class PersonServiceInheritance {

    public String  getPersonDetail(PersonInheritance personInheritance) {
        return  personInheritance.toString();
    }
}
