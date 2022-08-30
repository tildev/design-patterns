package ch01.duck;

import ch01.duck.fly.FlyBehavior;
import ch01.duck.quack.QuackBehavior;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public abstract class Duck {
    // 모든 Duck 에는 QuackBehavior 인터페이스를 구현하는 것의 레퍼런스가 있음
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
        super();
    }

    public abstract void display();

    public void performQuack() {
        // 직접 처리하는 대신, quackBehavior 로 참조되는 객체에 그 행동을 위임
        quackBehavior.quack();
    }

    public void performFly() {
        // 직접 처리하는 대신, flyBehavior 로 참조되는 객체에 그 행동을 위임
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
