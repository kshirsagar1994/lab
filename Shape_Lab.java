package String;

abstract class Shape { //create abstract class of shape
    abstract double calculateArea();
}

class Circle extends Shape { // circle extends from shape class 
								// shape is parent and circle is child class
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override   //override the area 
    double calculateArea() {
        return Math.PI * radius * radius;  //calculate radius using radius formula 
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {  //calculate rectangle 
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() { //calculate area
        return width * height;
    }
}

public class Shape_Lab {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);  //object creating of circle 
        System.out.println("Area of circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0); //object creating of rectangle 
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
