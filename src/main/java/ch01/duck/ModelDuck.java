package ch01.duck;

import ch01.duck.fly.FlyNoWay;
import ch01.duck.quack.Quack;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("ModelDuck");
    }
}
