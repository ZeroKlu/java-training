package e_files.ea_create;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {        
        String localDir = System.getProperty("user.dir");
        String path = localDir + "\\e_files\\data\\test.txt";
        System.out.println(path);

        // Create the file
        try {
            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred creating the file.");
            e.printStackTrace();
        }

        // Write to the file
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write("Handling files in Java isn't too tricky.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred writing the file.");
            e.printStackTrace();
        }
    }
}
