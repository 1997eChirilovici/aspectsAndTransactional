package com.endava.entity;

import com.endava.annotation.Walk;

public class Dog extends Animal {

    @Walk
    public void toWalk() {
        System.out.println("Take the dog for a walk");
    }

}
