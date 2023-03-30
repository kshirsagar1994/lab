/*you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
 * One Constructor will be used for initializing the value of variables. When an object is created, 
 * the constructor will be called and the default value of the instance variables will be assigned. 
 * Now create another new class ‘RectangleTest’ & create an object of class Rectangle and assign values of 
 * the parameter used in constructor. Calculate area of the rectangle and print it on the console. 
 * Let’s update the new value of variable. And then read the updated value.
 * */

package Labwork30march;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

/*
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 40);
        double area = rectangle.calculateArea();
        System.out.println("Area = " + area);

        rectangle.setLength(30);
        rectangle.setBreadth(30);
        double newArea = rectangle.calculateArea();
        System.out.println("New area = " + newArea);
    }
}
*/