package by.bntu.fitr.poisit.lytkina.workWithFiles;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class FileServiceTest {
    Path path;
    FileService fileService;

    @Before
    public void init(){
        path = Paths.get("src/main/resources/myFile.txt");
        fileService = new FileService();
    }


    @Test
    public void writeToFile() throws IOException {
        fileService.writeToFile(path, "Addition information");
    }

    @Test
    public void readFromFile() throws IOException {
        fileService.readFromFile(path);
    }

    @Test
    public void printInfAboutPath() {
        fileService.printInfAboutPath(path);

    }

    @Test
    public void filterText() throws IOException {
        fileService.filterText(path);
    }
}