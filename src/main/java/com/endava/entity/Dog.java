package com.endava.entity;

import com.endava.annotation.Walk;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal {

    @Walk
    public void toWalk() {
        System.out.println("Take the dog for a walk");
    }

}
