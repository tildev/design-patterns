package ch01.duck.quack;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
