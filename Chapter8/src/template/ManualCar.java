package template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 조작합니다");
    }

    @Override
    public void stop() {
        System.out.println("사람이 멈춥니다.");
    }
}
