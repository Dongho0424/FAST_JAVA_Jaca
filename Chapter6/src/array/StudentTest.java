package array;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        Student studentKim = new Student(1002, "Kim");

        studentLee.addSubject("Korean", 100);
        studentLee.addSubject("Math", 90);

        studentKim.addSubject("Korean", 90);
        studentKim.addSubject("Math", 80);
        studentKim.addSubject("English", 90);

        studentLee.showStudentInfo();
        System.out.println("++++++++++++++++++++++++++++++=");
        studentKim.showStudentInfo();
    }
}
