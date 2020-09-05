package com.endava.entity;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal {

    public void toWalk() {
        System.out.println("Take the dog for a walk");
    }

}
