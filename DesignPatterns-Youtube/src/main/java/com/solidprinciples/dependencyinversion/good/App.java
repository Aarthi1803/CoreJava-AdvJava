package com.solidprinciples.dependencyinversion.good;


public class App {
    public static void main(String[] args) {
        // Create calculator instance
        Calculator calculator = new Calculator();

        // Perform addition
        CalculatorOperation addOp = new AddOperation();
        int addResult = calculator.calculate(10, 5, addOp);
        System.out.println("Addition Result: " + addResult);

        // Perform subtraction
        CalculatorOperation subOp = new SubOperation();
        int subResult = calculator.calculate(10, 5, subOp);
        System.out.println("Subtraction Result: " + subResult);
    }
}
