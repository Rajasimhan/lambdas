package com.rv.functional.interfaces.lambdas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdasApplication {

    public static void main(String[] args) {
        SpringApplication.run(LambdasApplication.class, args);
        ConcreteStringManipulation concreteStringManipulation = new ConcreteStringManipulation();
        concreteStringManipulation.stringConcat("raja", "simhan");
        concreteStringManipulation.stringReplace("raja ", " simhan");
    }

}
