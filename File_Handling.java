import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args){
        //Code to create a new file.
        /*
        File myFile = new File("CreateFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        //Code to write to a file.
        try {
            FileWriter fileWriter = new FileWriter("CreateFile.txt");
            fileWriter.write("This is our first file from this java program\nThis is the write operation of the File handling");
            fileWriter.close();
        } catch (IOException e) {
             e.printStackTrace();
        }

        //Code to Reading a file.
        File myFile = new File("CreateFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        //Code to deleting a file.
        File myFile = new File("CreateFile.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: "+myFile.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file.");
        }
    }
}