package Abstraction;

abstract class Shape1 { // abstract class 
    public abstract double calculateArea(); //abstract method
}

class Circle extends Shape1 { //subclasses 
     double radius; 

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape1 { //subclasses 
     double width;
     double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class LabWork_AbstractClass_Shape {
    public static void main(String[] args) {
        Circle c = new Circle(7.0); //Create objects
        System.out.println("Circle area: " + c.calculateArea());

        Rectangle1 rectangle = new Rectangle1(3.0, 5.0);//Create objects
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

