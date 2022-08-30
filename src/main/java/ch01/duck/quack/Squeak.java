package ch01.duck.quack;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
