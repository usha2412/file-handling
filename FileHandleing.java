package File_Handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;

public class FileHandleing {
    public static java.lang.String String;
    //static String ="file_name"
    public static void main(String[] args) {
        System.out.println("Enter a file name :");
        Scanner sc = new Scanner(System.in);
        String file_name = sc.nextLine();
        //File created
        File text = new File(file_name);
        try{
            if(text.createNewFile()){
                System.out.println("File created : "+ text.getName());
            }
            else
                System.out.println("File exist");
        }
        catch (IOException e){
            System.out.println("An error is occurred");
            e.printStackTrace();
            sc.close();
        }
        //file writing
        try{
            // File obj =new File(practise.text);
            FileWriter obj= new FileWriter(file_name);
            obj.write("I am a Java Developer..\n");
            System.out.println("Successfully I have written file");
            obj.close();
        }

        catch (Exception e){
            System.out.println("Unsuccessful in file writing ");
            e.printStackTrace();
        }
        //file reading
        try{
            Scanner fileReader = new Scanner(text);
            System.out.println("File read");
                while(fileReader.hasNextLine()){
             String data= fileReader.nextLine();
            System.out.println(data);
        }
        }
        catch (Exception e){
            e.printStackTrace();
            sc.close();

        }
        //file modification
        try{
           Scanner scn =new Scanner(System.in);
           String  s1 =scn.nextLine();
            FileWriter fileModified = new FileWriter(file_name, true);
            System.out.println();
            fileModified.write(s1);
            fileModified.close();
            scn.close();
           System.out.println("File modified");

        }
        catch (Exception e){
            System.out.println("File not get modified");
            e.printStackTrace();
        }



        
    }
}
