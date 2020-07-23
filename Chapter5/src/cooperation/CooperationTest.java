package cooperation;

public class CooperationTest {
    public static void main(String[] args) {
        Student dongho = new Student("Choi", 5000);
        Bus bus100 = new Bus(100);
        Subway subwayBlue = new Subway(4);

        dongho.takeBus(bus100);
        dongho.takeSubway(subwayBlue);

        System.out.println(dongho.money);
    }
}
