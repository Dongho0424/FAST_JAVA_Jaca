package chapter8;

public class Sonata extends Car {
    @Override
    public void Start() {
        System.out.println("sonata start");
    }

    @Override
    public void drive() {
        System.out.println("sonata drive");
    }

    @Override
    public void stop() {
        System.out.println("sonata stop");
    }

    @Override
    public void turnOff() {
        System.out.println("sonata turnoff");
    }
}
