package com.core.basicspring2.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceAnnotation {

    private  final UserRepositoryAnnotation userRepositoryAnnotation;

    @Autowired
    public UserServiceAnnotation(UserRepositoryAnnotation userRepositoryAnnotation) {
        this.userRepositoryAnnotation = userRepositoryAnnotation;
    }

    public UserAnnotation findByEmail(String email) {
        return userRepositoryAnnotation.getUserByEmailRepository(email);
    }
}
