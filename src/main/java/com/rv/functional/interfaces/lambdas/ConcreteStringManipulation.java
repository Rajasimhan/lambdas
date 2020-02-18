package com.rv.functional.interfaces.lambdas;

public class ConcreteStringManipulation {

    public void stringConcat(String input1, String input2) {
        commonManipulation(
                (input3, input4) -> input3.concat(input4),
                input1,
                input2);
    }

    public void stringReplace(String input1, String input2) {
        commonManipulation(
                (input3, input4) -> input3.replace(" ", input4),
                input1,
                input2
        );
    }


    private void commonManipulation(StringManipulation stringManipulation, String input1, String input2) {
        System.out.println("input1 = " + input1 + ", input2 = " + input2);
        System.out.println(stringManipulation.Manipulate(input1, input2));
    }
}
