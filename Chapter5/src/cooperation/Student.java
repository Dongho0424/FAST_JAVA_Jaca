package cooperation;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(2100);
        this.money -= 2100;
    }

    public void showInfo(){
        System.out.println("hi_student");
    }
}
