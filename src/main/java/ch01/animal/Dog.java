package ch01.animal;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class Dog extends Animal{
    @Override
    public void makeSound() {
        bark();
    }
    void bark(){
        System.out.println("bark");
    }
}
