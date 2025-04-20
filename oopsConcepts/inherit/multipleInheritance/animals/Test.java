package oopsConcepts.inherit.multipleInheritance.animals;

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sayHello();

        Animal dog = new Dog(); //upCasting
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

        Dog myDog = (Dog) dog; //downCasting
    }
}
