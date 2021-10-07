package com.luv2code.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// this is our aspect and it is an aspect for logging
// Aspect is a java class that has all of our related advices
// first we need to tell Spring that it is an aspect by using @Aspect annotation
// we also want to add @Component to make it available for scanning
@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging
    // declaring point cut expression so it can be re-used later on other methods, we can name of our method anything
    // we like to
    @Pointcut("exectuion(* com.luv2code.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n executing ====> @Before advice on method");
    }
}
