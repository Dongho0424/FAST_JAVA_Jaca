package array;

public class ObjectCopy {
    public static void main(String[] args) {

        Book[] library = new Book[5]; // it is not that five books are created
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("title1", "dongho1");
        library[1] = new Book("title2", "dongho2");
        library[2] = new Book("title3", "dongho3");
        library[3] = new Book("title4", "dongho4");
        library[4] = new Book("title5", "dongho5");

        // shallow copy
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        library[0].setTitle("otherTitle");
        library[0].setAuthor("gangmin");



        // deep copy
        Book[] deepCopyLibrary = new Book[5];
        for(int i=0 ; i<deepCopyLibrary.length; i++){
            deepCopyLibrary[i] = new Book();
            deepCopyLibrary[i].setAuthor(library[i].getAuthor());
            deepCopyLibrary[i].setTitle(library[i].getTitle());
        }
        library[1].setTitle("asd");
        library[1].setAuthor("qweqe");
        for (Book book : copyLibrary) { // new for
            book.showBookInfo();
        }
        System.out.println("++++++++++++++++++++++++");
        for (Book book : library) {
            book.showBookInfo();
        }
        System.out.println("++++++++++++++++++++++++");
        for (Book book : deepCopyLibrary) {
            book.showBookInfo();
        }

    }
}
