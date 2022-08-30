package ch01.animal;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class Cat extends Animal{
    @Override
    public void makeSound() {
        meow();
    }
    void meow(){
        System.out.println("meow");
    }
}
