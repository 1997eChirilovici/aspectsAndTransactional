package com.endava.entity;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat extends Animal {

    public void toWalk() {
        System.out.println("Take the cat for a walk");
    }

}
