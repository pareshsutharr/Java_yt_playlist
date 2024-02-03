import java.io.*;
public class FileWriterMethod {
    public static void main(String[] args) {
       try{
        FileWriter obj = new FileWriter("filehandling.txt");
        obj.write("wellcome to the java file handling..");
        obj.write("wellcome to the java file handling..");
        obj.write("wellcome to the java file handling..");
        obj.close();
        System.out.println("File Successfully Created...");
       }catch(IOException e){
            System.out.println("File already Exists or Error occured..");
       }
    }
}
