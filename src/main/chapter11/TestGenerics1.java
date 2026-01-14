import java.util.*;

abstract class Animal {
    public void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {
    public void bark() {}
}

class Cat extends Animal {
    public void meow() {}
}


public class TestGenerics1 {
    public static void main(String[] args) {

        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);
         
    }
    
    public static void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
