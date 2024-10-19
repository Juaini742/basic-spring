package com.core.basicspring2.inheritance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InheritanceController {

    @Autowired
    private  PersonServiceInheritance personServiceInheritance;

    @Autowired
    @Qualifier("employeeInheritanceBean")
    private EmployeeInheritance employeeInheritance;

    @Autowired
    @Qualifier("managerInheritanceBean")
    private ManagerInheritance managerInheritance;

    @GetMapping("/employee") // http://localhost:8080/employee
    public String getEmployeeDetails() {
        return  personServiceInheritance.getPersonDetail(employeeInheritance);
    }

    @GetMapping("/manager") // http://localhost:8080/manager
    public String getManagerDetails() {
        return  personServiceInheritance.getPersonDetail(managerInheritance);
    }




}
