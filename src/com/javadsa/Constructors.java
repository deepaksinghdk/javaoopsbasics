package com.javadsa;

public class Constructors{
    public static void main(String[] args) {
        // Creating new Object of Person Class
        human p1 = new human();
        //calling the object funtions
        p1.age = 22;
        p1.height = 177;
        p1.name = "Rahul";
        p1.weight = 86;
        //creating another object with same class Person

        //this is a defaut constructor
        human p2 = new com.javadsa.human();
        //calling the object funtions
        p2.age = 21;
        p2.height = 181;
        p2.name = "Deepak";
        p2.weight = 82;
        //Printing the value
        System.out.println(p1.name + " " + p1.weight + " " + p1.age + " " + p1.height);
        System.out.println(p2.name + " " + p2.weight + " " + p2.age + " " + p2.height);
        //Calling Method
        p1.eat();
        p1.walk();
        p1.walk(1091);
        p1.walk(682);
    }
}
// Declaring the class outside the main class
class human {
    int age;
    int weight;
    int height;
    String name;
        static int count = 0;
        public human() {
        count++;
        System.out.println("creating a new object " + count +" times");
    }

    void walk(){
        System.out.println(name + " Can Walk");
    }
    void walk(int steps){
        System.out.println(name + " has walk " + steps + " steps");
    }
    void eat(){
        System.out.println(name + " Can eat");
    }

}
