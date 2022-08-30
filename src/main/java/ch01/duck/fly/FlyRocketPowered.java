package ch01.duck.fly;

/**
 * @author : tildev
 * @data : 2022-08-30
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly Rocket Powered");
    }
}
