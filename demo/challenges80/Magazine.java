package demo.challenges80;

public class Magazine extends LibraryItem{
    public String issueNumber;
    
    Magazine(String title){
        super(title);
    }
    Magazine(String title, String author){
        super(title, author);
    }

    public static void main(String[] args) {
        LibraryItem libItem = new LibraryItem("Ashish");

        libItem.checkout();

        Magazine mag = new Magazine("Animesh");
        
        libItem.checkout();



    }
}
