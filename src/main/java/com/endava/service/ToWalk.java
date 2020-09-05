package com.endava.service;

import com.endava.entity.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ToWalk {

    private Animal animal;

    public ToWalk(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @PostConstruct
    void letsGo() {
        animal.toWalk();
    }

}
