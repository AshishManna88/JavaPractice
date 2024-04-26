package demo.challenges80;

public class DVD extends LibraryItem{
    int duration;

    public static void main(String[] args) {
        LibraryItem libItem = new LibraryItem();

        libItem.title = "Story of the Book";
        System.out.println(libItem.title);
    }
}
