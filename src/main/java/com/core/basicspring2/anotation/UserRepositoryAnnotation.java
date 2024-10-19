package com.core.basicspring2.anotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryAnnotation {

    public UserAnnotation getUserByEmailRepository(String email) {
        return new UserAnnotation("John", email);
    }
}
