package com.tatertot;

public class Main {

    public static void sayHello(Animal animal) {
        animal.sayHello();
    }

    public static void main(String[] args) {
        Person person = new Person("bear", "fluffbutt");
        Employee employee = new Employee("Freddie", "Fluffbutt", 1);
        Animal cat = new Cat();
        Animal dog = new Dog();
        SportyCar sporty = new SportyCar();
        System.out.println(person.getFullName());
        System.out.println(employee.getFullName());
        System.out.println(employee.getEmployeeID());
        sayHello(cat);
        sayHello(dog);
        System.out.println(sporty.getInfo());
    }
}
