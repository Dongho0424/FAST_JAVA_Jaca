package chapter5;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2020, 7, 21);
        MyDate date2 = new MyDate(2020, 2, 29);
        MyDate date3 = new MyDate(2019, 4, 40);

        System.out.println(date1.isValid());
        System.out.println(date2.isValid());
        System.out.println(date3.isValid());
    }
}
