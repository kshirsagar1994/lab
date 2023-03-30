//How to create object in java, show demo using program.

package Labwork30march;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
/*
//public class Main {
  public class PersonTest {
 
    public static void main(String[] args) {
        // Create a Person object and assign it to a variable
        Person person = new Person("John", 30);

        // Call the sayHello method on the object
        person.sayHello();
    }
}
*/