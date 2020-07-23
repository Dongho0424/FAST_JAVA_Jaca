package staticex;

public class StudentIDTest {
    public static void main(String[] args) {
        Student studentLee = new Student("lee");
        System.out.println(studentLee.getSerialNum());
        Student studentKim = new Student("kim");
        System.out.println(studentLee.getSerialNum());
    }
}
