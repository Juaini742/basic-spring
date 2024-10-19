package com.core.basicspring2.inheritance;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigInheritance {

    @Bean
    public EmployeeInheritance employeeInheritanceBean() {
        return  new EmployeeInheritance("IT", "John", "john@gmail.com");
    }

    @Bean
    public ManagerInheritance managerInheritanceBean() {
        return new ManagerInheritance("Marketing", "Alice", "alice@mail.com", 3);
    }
}
