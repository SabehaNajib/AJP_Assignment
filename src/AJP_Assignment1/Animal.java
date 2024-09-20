package AJP_Assignment1;

abstract public class Animal {

    abstract public void makeSound();
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("The sound of Dog is : Bark");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("The sound of Cat is : Meow");
    }
}
class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
