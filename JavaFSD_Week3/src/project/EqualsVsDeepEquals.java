package project;

import java.util.*;
import java.util.Arrays;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        // Example 1: equals() method
        Person person1 = new Person("John");
        Person person2 = new Person("John");

        System.out.println("Using equals() on objects of the same class:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true

        // Example 2: equals() on different class objects
        Employee employee = new Employee("John");
        System.out.println("\nUsing equals() on objects of different classes:");
        System.out.println("person1.equals(employee): " + person1.equals(employee)); // false

        // Example 3: deepEquals() method
        Person[] personArray1 = {new Person("Alice"), new Person("Bob")};
        Person[] personArray2 = {new Person("Alice"), new Person("Bob")};

        System.out.println("\nUsing deepEquals() on arrays:");
        System.out.println("Arrays.equals(personArray1, personArray2): " + Arrays.equals(personArray1, personArray2)); // false
        System.out.println("Arrays.deepEquals(personArray1, personArray2): " + Arrays.deepEquals(personArray1, personArray2)); // true
    }
}
