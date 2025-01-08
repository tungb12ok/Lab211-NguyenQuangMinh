package j1.s.p0061_calculatorshapeprogram;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + radius);
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
    }

}
