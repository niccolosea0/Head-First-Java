import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
         
         try {
             FileWriter writer = new FileWriter("foo.txt");
             writer.write("Hello dear!\n");

             writer.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
    
