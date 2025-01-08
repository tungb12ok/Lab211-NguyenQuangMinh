/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0061_calculatorshapeprogram;

/**
 *
 * @author Admin
 */
public class CalculatorManagement {

    private final Validation validation = new Validation();

    public void run() {
        System.out.println("=====Calculator Shape Program=====");

        // Input for Rectangle
        double width = validation.checkPositiveNumber("Please input side width of Rectangle: ", "Width must be a positive number!");
        double length = validation.checkPositiveNumber("Please input length of Rectangle: ", "Length must be a positive number!");
        Shape rectangle = new Rectangle(width, length);

        // Input for Circle
        double radius = validation.checkPositiveNumber("Please input radius of Circle: ", "Radius must be a positive number!");
        Shape circle = new Circle(radius);

        // Input for Triangle
        double sideA = validation.checkPositiveNumber("Please input side A of Triangle: ", "Side A must be a positive number!");
        double sideB = validation.checkPositiveNumber("Please input side B of Triangle: ", "Side B must be a positive number!");
        double sideC = validation.checkPositiveNumber("Please input side C of Triangle: ", "Side C must be a positive number!");

        // Validate triangle sides
        while (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Invalid triangle sides. The sum of any two sides must be greater than the third side.");
            sideA = validation.checkPositiveNumber("Please input side A of Triangle: ", "Side A must be a positive number!");
            sideB = validation.checkPositiveNumber("Please input side B of Triangle: ", "Side B must be a positive number!");
            sideC = validation.checkPositiveNumber("Please input side C of Triangle: ", "Side C must be a positive number!");
        }
        Shape triangle = new Triangle(sideA, sideB, sideC);

        // Display results
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}