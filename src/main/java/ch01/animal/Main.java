package ch01.animal;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
