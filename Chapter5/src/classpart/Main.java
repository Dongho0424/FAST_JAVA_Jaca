package classpart;

public class Main {
    public static void main(String[] args) {
        Student studentchoi = new Student();
        studentchoi.studentName = "dongho";
        studentchoi.address = "seoul";

        studentchoi.showStudentInfo();

        System.out.println(studentchoi);
    }
}
