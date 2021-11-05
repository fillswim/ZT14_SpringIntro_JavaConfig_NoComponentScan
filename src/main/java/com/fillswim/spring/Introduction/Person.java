package com.fillswim.spring.Introduction;

import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    private final Pet pet;

    // DI с помощью конструктора
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
