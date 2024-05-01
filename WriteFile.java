

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFile {
    private static OutputStreamWriter write;

    public static void main(String[] args) {
        String str = "first-file.txt";
        try(FileWriter write = new FileWriter(str)){
            //write.write("File");
            write.append("File ")
            .append("was ")
            .append("Handled ");
            write.flush();
            System.out.println("Successfully Write in File");

        }catch(IOException e){
            System.out.println("File not found");
            e.getStackTrace();
        }
        // finally{
        //     try {
        //         write.close();
        //     } catch (IOException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }

    }
}
