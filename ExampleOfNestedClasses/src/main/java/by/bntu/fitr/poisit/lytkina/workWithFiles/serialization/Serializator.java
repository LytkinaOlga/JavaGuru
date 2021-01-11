package by.bntu.fitr.poisit.lytkina.workWithFiles.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializator {
    public boolean serialization(Person person, Path path) throws IOException {
        boolean flag = false;
        if (!Files.exists(path)){
            Files.createFile(path);
        }
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(path.toString());

        if (fileOutputStream!=null){
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            flag = true;
        }
        objectOutputStream.close();
        return flag;
    }
}
