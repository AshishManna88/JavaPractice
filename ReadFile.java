import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("first-filek.txt");
            
            int charac;
            while ((charac = reader.read()) != -1) {
                System.out.print((char)charac);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not Found");
            //e.getStackTrace();
        }
    }
}
