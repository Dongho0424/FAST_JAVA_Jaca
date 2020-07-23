package abstractex;

// abstract class abstract class abstract class abstract class abstract class
// for upper class for upper class for upper class for upper class
// 상속 받은 class가 구현해야 됨
public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("turn on the computer");
    }

    public void turnOff() {
        System.out.println("turn off the computer");
    }
}
