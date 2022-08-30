package ch01.duck;

import ch01.duck.fly.FlyWithWings;
import ch01.duck.quack.Quack;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("MallardDuck");
    }
}
