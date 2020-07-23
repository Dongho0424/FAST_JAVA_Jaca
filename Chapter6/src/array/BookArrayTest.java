package array;

public class BookArrayTest {
    public static void main(String[] args) {

        Book[] library = new Book[5]; // it is not that five books are created
        library[0] = new Book("asd", "qwe");

        for (int i=0; i<library.length;i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
