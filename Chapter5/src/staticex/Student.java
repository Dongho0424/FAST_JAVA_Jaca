package staticex;

public class Student {

    private static int serialNum = 1000;
    private int studentID;
    public String studentName;
    public String address;

    public Student(String name) {
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "No address";
        serialNum++;
        studentID = serialNum;
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
    //class method
    //static method
    // only use static variable;
    //don't use instance
    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }


}