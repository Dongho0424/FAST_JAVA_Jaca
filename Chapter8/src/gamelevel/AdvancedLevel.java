package gamelevel;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void jump() {
        System.out.println("jump rapidly");
    }

    @Override
    public void turn() {
        System.out.println("cannot turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("advanced level");
    }
}
