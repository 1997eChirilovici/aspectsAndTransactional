package com.endava.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnimalAspect {

    @Pointcut("@annotation(com.endava.annotation.Walk)")
    public void takeToWalkPointCut() {}

    @Before("takeToWalkPointCut()")
    void doSomethingBefore() {
        System.out.println("-----------------------------------------------");
        System.out.println("Before: Take the leash and the toys");
        System.out.println("-----------------------------------------------");
    }

    @After("takeToWalkPointCut()")
    void doSomethingAfter() {
        System.out.println("-----------------------------------------------");
        System.out.println("After: Good job");
    }

    @AfterReturning("takeToWalkPointCut()")
    void doSomethingAfterReturning() {
        System.out.println("-----------------------------------------------");
        System.out.println("AfterReturning: The method returns something");
        System.out.println("-----------------------------------------------");
    }

    @AfterThrowing("takeToWalkPointCut()")
    void doSomethingAfterThrowing() {
        System.out.println("-----------------------------------------------");
        System.out.println("AfterThrowing: The method throw something");
        System.out.println("-----------------------------------------------");
    }


}
