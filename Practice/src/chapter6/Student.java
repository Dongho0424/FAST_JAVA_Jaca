package chapter6;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentNum;
    private ArrayList<Book> bookList;

    public Student() {}
    public Student(int studentNum, String name) {
        this.name = name;
        this.studentNum = studentNum;
        bookList = new ArrayList<Book>();
    }

    public void addBook(String bookName, String bookAuthor){

        Book book = new Book(bookName, bookAuthor);
        bookList.add(book);
    }

    public void showStudentInfo(){
        System.out.println(name + " 학생이 읽은 책은 : ");
        for(Book book : bookList){
            System.out.print(book.getTitle() + " ");
        }
        System.out.println("입니다.");
    }

}
