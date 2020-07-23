package classpart;

public class Student { //only one public class in one file
    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

}
