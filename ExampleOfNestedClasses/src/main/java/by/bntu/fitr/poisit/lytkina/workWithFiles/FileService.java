package by.bntu.fitr.poisit.lytkina.workWithFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileService implements Serializable {
    public void printInfAboutPath(Path path){
        Path fileName = path.getFileName();
        System.out.println("filename is " + fileName);

        Path parent = path.getParent();
        System.out.println("parent is " + parent);

        Path root = path.getRoot();
        System.out.println("root is " + root);

        Path name = path.getName(1);
        System.out.println("name is " + name);
    }
    public void writeToFile(Path path, String text) throws IOException {
        if (!Files.exists(path)){
            Path file1 = Files.createFile(path);
        }
        Files.write(path, text.getBytes());


    }
    public void readFromFile(Path path) throws IOException {
        if (Files.exists(path)){
            String text = Files.readString(path);
            System.out.println(text);
        }else System.out.println("File is not exist");

    }
    public void filterText(Path path) throws IOException {
        if (Files.exists(path)){
            List<String> text = Files.readAllLines(path);
            Stream<String> textStream = text.stream();
            String result = textStream
                    .map(s -> s.toUpperCase())
                    .filter(lines -> lines.startsWith("FROM"))
                    .collect(Collectors.joining("\n"));
            writeToFile(path,result);


        }else System.out.println("File is not exist");

    }
}
