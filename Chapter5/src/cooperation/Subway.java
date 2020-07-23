package cooperation;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int num) {
        this.subwayNumber = num;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println("hi_subway");
    }
}
