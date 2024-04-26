package demo.challenges80;

public class LibraryItem {
    
    private String itemID;
    String title;
    public String author;
    
    LibraryItem(){}
    LibraryItem(String title){this.title = title;}
    LibraryItem(String title, String author){this.title = title; this.author = author;}

    public void checkout(){
        System.out.println("Print checkout");
    }
    public void returnItem(){
        System.out.println("Print ReturnItem");
    }
}
