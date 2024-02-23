package Challange;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory {

    private static void writeUsingFiles(Path path2) {

        String data = """
            package X;

            public class automated {

                public static void main(String[] args){

                    System.out.println("Hello World");
                }
            }
                """;
        try
        {
            Files.write(path2, data.getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        String name="/Users/mac/Desktop/quiz/X";
        Path path1= Paths.get(name);
        Path path2 = Paths.get(name + "/automated.java");
        if(!Files.exists(path1)) //creates a new folder
        {
            Files.createDirectory(path1);
            File file = new File(name + "/automated.java");
            file.createNewFile(); //creates a new file for java;
            System.out.println("Creatin of directory succesful");
            
        }
        else 
        {
            System.out.println("The directory with this name already exits");
        }
        writeUsingFiles(path2);
    }
}
