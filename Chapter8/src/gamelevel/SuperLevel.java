package gamelevel;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("run fast fast");
    }

    @Override
    public void jump() {
        System.out.println("jump rapidly");
    }

    @Override
    public void turn() {
        System.out.println("turn beautifully");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("super level");
    }
}
