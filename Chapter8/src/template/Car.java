package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){}

    final public void run(){ // 재 정의 할 수 없게 만들어서 "템플릿 로직"이 변하지 않게 한다.
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
