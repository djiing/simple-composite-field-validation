package com.example.demo.validation;

import com.example.demo.model.DemoUser;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

public class MatchingLanguageValidator implements ConstraintValidator<MatchingLanguage, DemoUser> {


    @Override
    public void initialize(MatchingLanguage matchingLanguage) {

    }

    @Override
    public boolean isValid(DemoUser demoUser, ConstraintValidatorContext constraintValidatorContext) {
        return Optional.ofNullable(demoUser.getLanguages())
                .filter(e -> e.contains(demoUser.getBaseLanguage()))
                .isPresent();
    }
}