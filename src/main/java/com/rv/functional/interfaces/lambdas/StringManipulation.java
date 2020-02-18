package com.rv.functional.interfaces.lambdas;

public interface StringManipulation {
    String manipulate(String input1, String input2);

    default void defaultMethod() {
        System.out.println("StringManipulation interface is an example for Lambdas in java 8");
    }
}
