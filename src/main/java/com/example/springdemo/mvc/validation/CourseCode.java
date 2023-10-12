package com.example.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default source code value
    public String value() default "ABC";

    // define default error message
    public String message() default "must start with ABC";

    // define default groups( can group related constraints )
    public Class<?>[] groups() default {};

    //define default payloads ( payloads provide custom details about validation failure )
    public Class<? extends Payload>[] payload() default {};
}
