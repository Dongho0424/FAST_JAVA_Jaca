package abstractex;

public class DeskTop extends Computer{


    @Override
    public void display() {
        System.out.println("DeskTop display");

    }

    @Override
    public void typing() {

    }

    @Override
    public void turnOff() {
        System.out.println("desktop turnOff");
    }
}
