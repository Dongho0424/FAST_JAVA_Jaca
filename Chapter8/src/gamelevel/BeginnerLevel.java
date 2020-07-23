package gamelevel;

public class BeginnerLevel  extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("run slow");
    }

    @Override
    public void jump() {
        System.out.println("cannot jump");
    }

    @Override
    public void turn() {
        System.out.println("cannot turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("beginner level");
    }
}
