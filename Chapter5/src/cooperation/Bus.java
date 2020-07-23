package cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int num) {
        this.busNumber = num;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println("hi_bus");
    }

}
