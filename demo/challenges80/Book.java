package demo.challenges80;

public class Book extends LibraryItem{
    public String isbnNumber;

    public static void main(String[] args) {
        LibraryItem libItem = new LibraryItem();

        libItem.author = "A.Manna";
        System.out.println(libItem.author);
    }
}
