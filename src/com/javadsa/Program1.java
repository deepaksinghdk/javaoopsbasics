package com.javadsa;

public class Program1 {
    public static void main(String[] args) {
        // Creating new Object of Person Class
        Person p1 = new Person();
        //calling the object funtions
        p1.age = 22;
        p1.height = 177;
        p1.name = "Rahul";
        p1.weight = 86;
        //creating another object with same class Person
        Person p2 = new Person();
        //calling the object funtions
        p2.age = 21;
        p2.height = 181;
        p2.name = "Deepak";
        p2.weight = 82;
        //Printing the value
        System.out.println(p1.name + " " + p1.weight + " " + p1.age + " " + p1.height);
        System.out.println(p2.name + " " + p2.weight + " " + p2.age + " " + p2.height);
    }
}
// Declaring the class outside the main class
class Person{
    int age;
    int weight;
    String name;
    int height;
}
