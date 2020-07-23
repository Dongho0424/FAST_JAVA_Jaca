package chapter8;

public abstract class Car {
    public abstract void Start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();

    public void washCar(){
        System.out.println("세차");
    }

    final public void run(){
        Start();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
